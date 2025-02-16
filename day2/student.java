package com.insight.day2;

public class student {
	protected int rollno;
	protected String fname;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", fname=" + fname + "]";
	}
	public student(int rollno, String fname) {
		super();
		this.rollno = rollno;
		this.fname = fname;
	}
	
}
