package com.ig.Multithreading_Tasks;

import java.util.Random;

class AdvisorThread extends Thread {
	String[]advices;

	public AdvisorThread(String[] advices) {
		this.advices = advices;
	}
	
	public void run() {
		Random random = new Random();
		int randomIndex = random.nextInt(advices.length);
		System.out.println(Thread.currentThread().getName() + " - Advice: "+advices[randomIndex]);
	}
}

public class Multithreading_Task2 {
	public static void main(String[] args) {
		String[] advices = {
	            "Never begin to stop and never stop to begin.",
	            "Only destination isn’t important, one should enjoy the journey.",
	            "Impossible itself says ‘I’m possible’.",
	            "Success is not final, failure is not fatal: It is the courage to continue that counts.",
	            "Believe you can and you're halfway there."
	        };
		
		AdvisorThread t1 = new AdvisorThread(advices);
		AdvisorThread t2 = new AdvisorThread(advices);
		
		t1.setName("t1");
		t2.setName("t2");
		
//		t1.setPriority(10);	
		
		t1.start();
		t2.start();
	}
}
