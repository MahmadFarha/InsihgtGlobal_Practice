package com.inisght.day5;
//1.try catch 2.try multiple catch 3.nested try ctach 4.try,catch,fianally

public class exDemo1 {

	public static void main(String[] args){
		int a=10;
		int b=0;
//		int c=a/b; unchecked,runtime.....it doesnt execute next lines also..so we
//		use try,catch blocks
//		System.out.println(c);
//		System.out.println("Thanks");
		
		int c;
		int[] x= {4,5,6};
		try {
		   System.out.println(x[4]);
		   try {
			c=a/b;
			System.out.println(c);
			
			//System.out.println(x[0]);
		   }
		   catch(ArithmeticException e) {
			System.out.println(e);
		   }
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Thanks");

	}

}
//if two exce
