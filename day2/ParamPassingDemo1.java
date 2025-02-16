package com.insight.day2;

public class ParamPassingDemo1 {
	static int modify(int i) {
		return ++i;
	}
	static int modify(student x) {
		return ++x.rollno;
	}
	static String modify(String fname) {
		return fname.concat("mahmad");
	}
	public static void main(String[] args) {
		student s=new student(1,"farha");
		int y=4;
		System.out.println("primitive types");
		System.out.println(modify(y));
		System.out.println(y);
		
		
		System.out.println("objects");
		System.out.println(modify(s));
		System.out.println(s.rollno);
		
		
		System.out.println("strings");
		System.out.println(modify(s.fname));
		System.out.println(s.fname);
		
	}

}
