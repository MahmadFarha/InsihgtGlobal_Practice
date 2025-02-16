package com.insight.day2;


class emp{
	int empid;
	String name;
	Dept dept;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public emp(int empid, String name, Dept dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
class Dept{
	int did;
	String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public Dept(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
}
public class hasDemo {

	public static void main(String[] args) {
		emp e=new emp(1,"farha",new Dept(72,"IT"));
		System.out.println(e);
	}

}
