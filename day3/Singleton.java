package com.insight.day3;

class Singleton1{
	private static Singleton1 s=null;
	private Singleton1() {
		
	}
	public static Singleton1 getInstance() {
		if(s==null) {
			s=new Singleton1();
		}
		return s;
	}
}
public class Singleton {
	public static void main(String[] args) {
		Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance(); 
		System.out.println(s1.hashCode()+" "+s2.hashCode());
	}
}
