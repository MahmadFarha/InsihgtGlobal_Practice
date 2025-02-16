package com.inisght.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exDemo3 {
	
	public static void disp() throws InterruptedException,FileNotFoundException{
		Thread.sleep(500);  //checked
		FileReader f=new FileReader("c:\\abc.text");  //checked
		System.out.println("hello");
		
	}

	public static void main(String[] args) throws InterruptedException,FileNotFoundException {
		// TODO Auto-generated method stub
		disp();

	}

}
