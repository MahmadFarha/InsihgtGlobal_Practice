package com.insight.day2;

public class Test_calculateArea {
	public static void main(String[] args) {
	   Shape[] shapes=new Shape[3];
	   shapes[0]=new triangle(3,4);
	   shapes[1]=new square(4);
	   shapes[2]=new rectangle(2,5);
	   for(Shape s:shapes) {
		  System.out.println(s.calculateArea());
	   }
	}
}
