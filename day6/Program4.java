package day6;

import java.util.Scanner;

public class Program4 {
	public static String reshape(String str,char sep)
	{
		StringBuilder reversedStr=new StringBuilder(str);
		reversedStr.reverse();
		StringBuilder finalStr=new StringBuilder();
		for(int i=0;i<reversedStr.length();i++)
		{
			finalStr.append(reversedStr.charAt(i));
			if(i!=reversedStr.length()-1)
			{
				finalStr.append(sep);
			}
		}
		return finalStr.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		String str=sc.nextLine();
		System.out.println("enter the seperator character : ");
		char sep=sc.next().charAt(0);
		String output=reshape(str,sep);
		System.out.println("result is : "+output);

	}

}
