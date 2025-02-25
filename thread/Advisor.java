package com.insight13.thread;

import java.util.Random;

public class Advisor {
	static String[] advices= {"1","2","3","4","5","6"};
	static class AdvisorThread extends Thread{
		private String advice;
		AdvisorThread(String advice){
			this.advice=advice;
		}
		public void run() {
			try {
				Thread.sleep(10000);
				System.out.println(advice);
			}
			catch(InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}
		
	}
	public static void main(String[] args) {
		Random random=new Random();
		int index=random.nextInt(advices.length);
		String advice=advices[index];
		AdvisorThread ad=new AdvisorThread(advice);
		ad.start();
		}
}