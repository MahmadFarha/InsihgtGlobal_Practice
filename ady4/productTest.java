package com.inisght.ady4;
//import java.util.Scanner;

public class productTest {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		product pro=new product(10,"adafev",100,1021425.00);
		productservice ps=new productservice();
		ps.addproduct(new product(10,"ohool",80,1000.00));
		ps.addproduct(new product(19,"wgqdiqw",72,29000.00));
		System.out.println(ps.addproduct(pro));
		System.out.println(ps.deleteproduct(pro));
		ps.listproducts();
		System.out.println(ps.getprobyid(10));
		System.out.println(ps.getpricebyid(19));
	}

}
