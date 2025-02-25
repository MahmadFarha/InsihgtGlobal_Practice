package com.insight13.thread;


//custom thread using Thread Class( extends)
public class ThreadDemo1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
		
	public static void main(String[] args) {
				
		System.out.println(Thread.currentThread().getName());
		


		ThreadDemo1 t1=new ThreadDemo1();
		t1.start();
		t1.setName("Farha custom thread 1");
		
		ThreadDemo1 t2=new ThreadDemo1();
		t2.start();
		t2.setName("custom thread 2");
		
		System.out.println(Thread.activeCount());
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.activeCount());

	}

}
