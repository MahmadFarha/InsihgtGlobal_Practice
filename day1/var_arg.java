package com.insight.day1;

public class var_arg {
	static int sum(int... a) {
		int s=0;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
		}
		return s;
	}

	public static void main(String[] args) {
		int[] x1= {1,2,3};
		System.out.println(sum(x1));
		int[] x2= {4,5,6};
		System.out.println(sum(x2));
	}

}
