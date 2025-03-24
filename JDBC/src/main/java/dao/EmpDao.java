package dao;

import java.util.List;

import exception.EmpNotFoundException;
import model.Employee;

public interface EmpDao {
	public String addEmp(Employee emp) throws EmpNotFoundException, Exception;
	public List<Employee> getAllEmp() throws Exception;
	public Employee getEmpById(int id) throws Exception;
	public String updateEmp(String ename, Double esalary, int id) throws Exception;
	public String deleteById(int id) throws Exception;
}
