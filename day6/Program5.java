package day6;

import java.util.Scanner;

public class Program5 {
	
	public static String getLastLetter(String sentence)
	{
		String [] words=sentence.split(" ");
		StringBuilder res=new StringBuilder();
		for(String word:words)
		{
			if(!word.isEmpty())
			{
				char LL=word.charAt(word.length()-1);
				res.append(Character.toUpperCase(LL));
			}
		}
		return res.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence : ");
		String sentence=sc.nextLine();
		String result=getLastLetter(sentence);
		System.out.println("result is : "+result);

	}

}
