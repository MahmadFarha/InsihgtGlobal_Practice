package com.insight.day2;

import java.util.Arrays;

public class ParamPassingDemo2 {
	static void swap(int x,int y) {
		int temp=x;
		x=y;
		y=temp;
	}
	static void swap(int[] x,int[] y) {
	    if (x.length == y.length) {
	        for (int i = 0; i < x.length; i++) {
	            int temp = x[i];
	            x[i] = y[i];
	            y[i] = temp;
	        }
	    }
	}
	
	
	@Override
	public String toString() {
		return "ParamPassingDemo2 [toString()=" + super.toString() + "]";
	}
	public static void main(String[] args) {
		int x=4,y=6;
		int[] a= {1,3,5};
		int[] b= {22,66,99};
		System.out.println("x= "+x+" ,"+"y= "+y);
		swap(x,y);
		System.out.println("x= "+x+" ,"+"y= "+y);
		
		System.out.println("a= "+Arrays.toString(a)+", "+"b= "+Arrays.toString(b));
		swap(a,b);
		System.out.println("a= "+Arrays.toString(a)+", "+"b= "+Arrays.toString(b));
	}

}
 