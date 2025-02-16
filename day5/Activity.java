package com.inisght.day5;

public class Activity {
	private String s1;
	private String s2;
	private String op;
	 public Activity() {
		 
	 }
	public Activity(String s1, String s2, String op) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.op = op;
	}
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	public String getop() {
		return op;
	}
	public void setop(String op) {
		this.op = op;
	}
	@Override
	public String toString() {
		return "Activity [s1=" + s1 + ", s2=" + s2 + ", op=" + op + "]";
	}
	
	 
}
