package com.insight.day2;

public class inner1 {
	int y=10;
	class inner{
		int x=20;
		int imethod(){
			return y;
		}
	}
	int omethod(){
		inner z=new inner();
		return z.x;
	}

	public static void main(String[] args) {
		inner1 i=new inner1();
		System.out.println(i.omethod());
		inner1.inner ii=new inner1().new inner();
		System.out.println(ii.imethod());
	}

}
