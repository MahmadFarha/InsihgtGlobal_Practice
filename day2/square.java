package com.insight.day2;

public class square extends Shape{
	public square(int length) {
		super(length);
	}
	@Override
	public double calculateArea() {
		return (double)(length*length);
	}
}
