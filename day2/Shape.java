package com.insight.day2;

public abstract class Shape {
	protected int length;
	
	public Shape(int length) {
		this.length = length;
	}

	public abstract double calculateArea();
}
