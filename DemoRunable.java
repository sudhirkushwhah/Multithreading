package com.kodewala.academy;

public class DemoRunable {
	public static void main(String[] args) {
		Thread.currentThread().getName();
		System.out.println("running main() method");
		FirstThread T1 = new FirstThread(); // NEW
		Thread t2 = new Thread(T1);
		t2.start(); // RUNABLE
		// TERMINATE
		
		

	}

}

class FirstThread implements Runnable {
	// RUNNING
	@Override
	public void run() {
		System.out.println("this is runnable thread");
		try {
			Thread.sleep(5000); // WAIT //BLOCKED
		} catch (Exception e) {
			e.printStackTrace();
		}
		// RUNNING
		System.out.println("end main() method");

	}

}


