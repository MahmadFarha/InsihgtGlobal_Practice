package com.insight13.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TimeToSort extends Thread {
	List<Integer> list;
	public TimeToSort(List<Integer> list) {
		super();
		this.list=list;
	}
	public void run() {
		Collections.sort(list);
	}

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<10000;i++) {
			list.add(new Random().nextInt());
		}
		long start=System.currentTimeMillis();
		TimeToSort t=new TimeToSort(list);
		t.start();
		
		try {
			t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("time to sort "+(System.currentTimeMillis()-start)+" ms");
	}

}
