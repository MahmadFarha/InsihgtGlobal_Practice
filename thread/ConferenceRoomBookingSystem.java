package com.insight13.thread;

class ConferenceRoomBookingJob {
 
    private boolean isRoomAvailable = true;


    public synchronized boolean isRoomAvailable() {
        return isRoomAvailable;
    }

    
    public synchronized void bookRoom(String managerName) {
        if (isRoomAvailable) {
            isRoomAvailable = false;  
            System.out.println(managerName + " has booked the conference room and is conducting the meeting.");
            try {
                Thread.sleep(3000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isRoomAvailable = true;  
            System.out.println(managerName + " has finished the meeting and released the room.");
        } else {
            System.out.println(managerName + " could not book the room as it is already in use.");
        }
    }
}

class ManagerThread extends Thread {
    private ConferenceRoomBookingJob bookingJob;
    private String managerName;

   
    public ManagerThread(String managerName, ConferenceRoomBookingJob bookingJob) {
        this.managerName = managerName;
        this.bookingJob = bookingJob;
    }

    @Override
    public void run() {
        System.out.println(managerName + " is checking room availability...");
        if (bookingJob.isRoomAvailable()) {
            bookingJob.bookRoom(managerName); 
        } else {
            System.out.println(managerName + " is waiting for the room to become available.");
        }
    }
}

public class ConferenceRoomBookingSystem {
    public static void main(String[] args) {
        ConferenceRoomBookingJob bookingJob = new ConferenceRoomBookingJob();

  
        ManagerThread manager1 = new ManagerThread("Manager 1", bookingJob);
        ManagerThread manager2 = new ManagerThread("Manager 2", bookingJob);

        manager1.start();
        manager2.start();
    }
}
