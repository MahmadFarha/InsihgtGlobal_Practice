package com.insight.day2;

public class rectangle extends Shape{
	int breadth;
	
	public rectangle(int length, int breadth) {
		super(length);
		this.breadth = breadth;
	}

	public double calculateArea() {
		return (double)(length*breadth);
	}
}
