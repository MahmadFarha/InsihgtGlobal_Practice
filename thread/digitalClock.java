package com.insight13.thread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class digitalClock {
	static class digitalThread extends Thread{
		public void run() {
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
			while(true) {
				LocalTime current=LocalTime.now();
				String formattedTime=current.format(formatter);
				System.out.println(formattedTime);
				try {

				Thread.sleep(500);
				
				}
				catch(InterruptedException e) {
					e.printStackTrace();
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		digitalThread d=new digitalThread();
		d.start();
	}

}
