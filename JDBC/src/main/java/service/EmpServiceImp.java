package service;

import java.util.List;

import dao.EmpDao;
import dao.EmpDaoImp;
import exception.EmpNotFoundException;
import model.Employee;

public class EmpServiceImp implements EmpService{
	EmpDao empDao;
	@Override
	public String addEmp(Employee emp) throws EmpNotFoundException, Exception{
		empDao = new EmpDaoImp();
		return empDao.addEmp(emp);
	}
	@Override
	public List<Employee> getAllEmp() throws Exception {
		empDao = new EmpDaoImp();
		return empDao.getAllEmp();
	}
	@Override
	public Employee getEmpById(int id) throws Exception {
		empDao = new EmpDaoImp();
		return empDao.getEmpById(id);
	}
	@Override
	public String updateEmp(String ename, Double esalary, int id) throws Exception {
		empDao = new EmpDaoImp();
		return empDao.updateEmp(ename, esalary, id);
	}
	@Override
	public String deleteById(int id) throws Exception {
		empDao = new EmpDaoImp();
		return empDao.deleteById(id);
	}
}
