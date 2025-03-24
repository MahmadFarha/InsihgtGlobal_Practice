package day6;

import java.util.Scanner;

public class Program3 {
	
	public static boolean validatePAN(String pan)
	{
		if(pan.length()!=8)
		{
			return false;
		}
		String regex="^[A-Z]{3}\\d{4}[A-Z]$";
		
		return pan.matches(regex);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter PAN number : ");
		String pan=sc.next();
		if(validatePAN(pan))
		{
			System.out.println("VALID");
		}
		else {
			System.out.println("INVALID");
		}
		
	}

}
