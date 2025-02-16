package com.inisght.ady4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) throws IOException {
		AccountService obj=new AccountService();
		FileReader f1 = new FileReader("C:\\Users\\MahmadFarhafathima\\OneDrive - Insight Global, LLC\\Documents\\sample1.txt");
		BufferedReader b=new BufferedReader(f1);
		String line=null;
		while((line=b.readLine())!=null) {
			System.out.println(line);
		}
		Account a =new Account(1,"iguser",299.00);
		obj.addaccount(a);
		obj.listaccounts();
		System.out.println(obj.getnamebyacc(a));
		System.out.println("enter the id of acc to be deleted");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(obj.delaccbyid(n));
	}

}
