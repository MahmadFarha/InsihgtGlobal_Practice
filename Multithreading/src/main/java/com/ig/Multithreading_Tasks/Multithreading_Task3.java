package com.ig.Multithreading_Tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

class DigitalClock extends Thread {
	public void run() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:MM:SS");
		while(true) {
			Date date = new Date();
			System.out.println(formatter.format(date));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

public class Multithreading_Task3 {

	public static void main(String[] args) {
		DigitalClock clockThread = new DigitalClock();
		clockThread.start();
	}

}
