package day6;

import java.util.Scanner;

public class Program2 {

	public static Integer findMaxDistance(int[] arr, int n)
	{
		if(n<2)
		{
			return null;
		}
		int maxDiff=0;
		int maxIdx=-1;
		for(int i=0;i<n-1;i++)
		{
			int diff=Math.abs(arr[i]-arr[i+1]);
			if(diff>maxDiff)
			{
				maxDiff=diff;
			if(arr[i]>arr[i+1])
			{
				maxIdx=i;
			}
			else {
				maxIdx=i+1;
			}
		}
	}
		return maxIdx;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array : ");
		int n=sc.nextInt();
		System.out.println("enter the array elements : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int index=findMaxDistance(arr,n);
		System.out.println(index);
		
	}

}
