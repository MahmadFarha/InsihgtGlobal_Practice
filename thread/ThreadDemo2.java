package com.insight13.thread;

//Custom thread using runnable interaface
public class ThreadDemo2 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadDemo2 t2=new ThreadDemo2();  //thread in new state, runnable
		Thread t=new Thread(t2);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}

}
