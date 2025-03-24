package model;

public class Employee {
	Integer eid;
	String ename;
	Double esalary;
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsalary() {
		return esalary;
	}
	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
}
