// -> unsynchronized
package com.ig.Multithreading_Tasks;

class ConferenceRoomBookingJob {
	boolean isRoomAvailable = true;
	
	public  void bookRoom(String managerName) {
		System.out.println(managerName + " is checking room availability...");
		
		if(isRoomAvailable) {
			System.out.println("Room is available. "+ managerName+" is conducting the meeting.");
			isRoomAvailable = false;
			
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println(managerName + "was interrupted.");
			}
			
			System.out.println(managerName +" has finished the meeting.");
			isRoomAvailable = true;
		} else {
			System.out.println("Room is not available. "+managerName+ " is waiting.");
		}
	}
}

public class Multithreading_Task1 extends Thread {

	ConferenceRoomBookingJob bookingJob;
	String managerName;
	
	Multithreading_Task1(ConferenceRoomBookingJob bookingJob, String managerName){
		this.bookingJob = bookingJob;
		this.managerName = managerName;
	}
	
	@Override
	public void run() {
		bookingJob.bookRoom(managerName);
	}
	
	public static void main(String[] a) {
		ConferenceRoomBookingJob bookingJob = new ConferenceRoomBookingJob();
		Multithreading_Task1 manager1 = new Multithreading_Task1(bookingJob, "Manager 1");
		Multithreading_Task1 manager2 = new Multithreading_Task1(bookingJob, "Manager 2");
		
		manager1.start();
		manager2.start();		
	}
}




// -> synchronized
//package com.ig.Multithreading_Tasks;
//
//class ConferenceRoomBookingJob {
//	boolean isRoomAvailable = true;
//	
//	public synchronized void bookRoom(String managerName) {
//		System.out.println(managerName + " is checking room availability...");
//		
//		if(isRoomAvailable) {
//			System.out.println("Room is available. "+ managerName+" is conducting the meeting.");
//			isRoomAvailable = false;
//			
//			try {
//				Thread.sleep(3000);
//			}catch(InterruptedException e) {
//				Thread.currentThread().interrupt();
//				System.out.println(managerName + "was interrupted.");
//			}
//			
//			System.out.println(managerName +" has finished the meeting.");
//			isRoomAvailable = true;
//		} else {
//			System.out.println("Room is not available. "+managerName+ " is waiting.");
//		}
//	}
//}
//
//public class Multithreading_Task1 extends Thread {
//
//	ConferenceRoomBookingJob bookingJob;
//	String managerName;
//	
//	Multithreading_Task1(ConferenceRoomBookingJob bookingJob, String managerName){
//		this.bookingJob = bookingJob;
//		this.managerName = managerName;
//		this.start();
//	}
//	
//	@Override
//	public void run() {
//		bookingJob.bookRoom(managerName);
//	}
//	
//	public static void main(String[] a) {
//		ConferenceRoomBookingJob bookingJob = new ConferenceRoomBookingJob();
//		Multithreading_Task1 manager1 = new Multithreading_Task1(bookingJob, "Manager 1");
//		Multithreading_Task1 manager2 = new Multithreading_Task1(bookingJob, "Manager 2");
//	}
//}