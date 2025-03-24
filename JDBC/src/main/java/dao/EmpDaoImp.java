package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.EmpNotFoundException;
import model.Employee;
import util.DBUtil;

public class EmpDaoImp implements EmpDao{
	@Override
	public String addEmp(Employee emp) throws EmpNotFoundException, Exception{
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("Insert into emp values(?, ?, ?)");
		ps.setInt(1, emp.getEid());
		ps.setString(2, emp.getEname());
		ps.setDouble(3, emp.getEsalary());
		ps.execute();
		return "Employee Record Added Successfully";
	}

	@Override
	public List<Employee> getAllEmp() throws Exception {
		List<Employee> empList = new ArrayList<Employee>();
		Connection con = DBUtil.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from emp");
		while(rs.next()) {
			Employee emp1 = new Employee();
//			System.out.println(rs.getInt(1) + " " + rs.getString(2));
			emp1.setEid(rs.getInt(1));
			emp1.setEname(rs.getString(2));
			emp1.setEsalary(rs.getDouble(3));
			empList.add(emp1);
//			System.out.println(emp1);
		}
		return empList;
	}

	@Override
	public Employee getEmpById(int id) throws Exception {
		Connection con = DBUtil.getConnection();
		Statement st = con.createStatement();
		PreparedStatement ps = con.prepareStatement("Select * from emp where eid = ?");
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		
		Employee emp1 = null;
		if(rs.next()) {
			emp1 = new Employee();
			emp1.setEid(rs.getInt(1));
			emp1.setEname(rs.getString(2));
			emp1.setEsalary(rs.getDouble(3));
		}
		return emp1;
	}

	@Override
	public String updateEmp(String ename, Double esalary, int id) throws Exception {
		Connection con = DBUtil.getConnection();
		Statement st = con.createStatement();
		PreparedStatement ps = con.prepareStatement("Update emp set ename = ?, esalary = ? where eid = ?");
		ps.setString(1, ename);
		ps.setDouble(2, esalary);
		ps.setInt(3,id);
		ps.execute();
		return "Employee Record Updated Successfully";
	}

	@Override
	public String deleteById(int id) throws Exception {
		Connection con = DBUtil.getConnection();
		Statement st = con.createStatement();
		PreparedStatement ps = con.prepareStatement("Delete from emp where eid = ?");
		ps.setInt(1,id);
		ps.execute();
		return "Employee Record Deleted Successfully";
	}

}
