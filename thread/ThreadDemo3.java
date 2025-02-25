package com.insight13.thread;

public class ThreadDemo3 extends Thread {
	public void run() {
		
		for(int i=0;i<5;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo3 t1=new ThreadDemo3();
		t1.start();
		t1.setName("Farha custom thread 1");
		
		//t1.setPriority(MAX_PRIORITY);
		//t1.setPriority(MAX_PRIORITY);
		//t1.setPriority(MIN_PRIORITY);
		//t1.setPriority(1);   you can give 1 to 10
		
		
		
		//t1.interrupt();
		//t1.yield();
		//t1.suspend();
		//t1.resume();
		
		
	    //System.out.println(t1.isAlive());
	    //t1.setDaemon(true);     //weak thread, low priority
	    //System.out.println(t1.isDaemon());
		
		for(int i=0;i<5;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName());

	}

}
