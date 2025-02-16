package com.insight.day2;

public class triangle extends Shape {
	int height;
	public triangle(int height,int length) {
		super(length);
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return 0.5*length*height;
	}
}
