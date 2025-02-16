package com.insight.day1;

public class initializer {
	static String city="hyd";
	static {
		System.out.println("executes before main");
	}
	String name;
	{
		System.out.println("instance block1");
	}
	
	public initializer(String name) {
		super();
		this.name = name;
	}

	static void disp() {
		System.out.println("static metod");
	}
	static int sum() {
		return 1;
	}
	
	
	
	public static void main(String[] args) {
		
		//static block execution
		System.out.println("main starts");
		System.out.println(initializer.sum());
		
		//instance block execution
		initializer i=new initializer("farha");
		System.out.println(i.name);
	
	}

}
