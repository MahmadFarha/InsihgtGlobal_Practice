package com.insight13.thread;

class Manager{
	public boolean isavailable=true;
	public synchronized boolean available() {
		if(isavailable) {
			isavailable=false;
			book();
			return true;
		}
		return false;
	}
	
	public synchronized void book() {
		try {
			System.out.println("the meeting is currently helding by "+Thread.currentThread().getName());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			isavailable=true;
			System.out.println("the meeting was completed by "+Thread.currentThread().getName());	
		}
	}
}
public class ManagerDemo extends Thread {
	Manager m;
	ManagerDemo(Manager m){
		this.m=m;
	}
	
	@Override
	public void run() {
		if(m.available()) {
			System.out.println("room booked by "+Thread.currentThread().getName()+" successfully");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" could not book room ,because its already in use");
		}
	}

	public static void main(String[] args) {
		Manager m=new Manager();
		ManagerDemo m1=new ManagerDemo(m);
		m1.setName("Manager1");
		ManagerDemo m2=new ManagerDemo(m);
		m2.setName("Manager 2");
		m1.start();
		m2.start();

	}

}
