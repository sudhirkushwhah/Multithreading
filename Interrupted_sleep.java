package com.java.multithread;

class TestSleep extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Runing Utkarsh");
		}
		System.out.println(" going to sleeping state because we are lazy");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException Again");
		}
	}
}

public class Interrupted_sleep {
	public static void main(String[] args) {
     Thread t1 = new Thread(new TestSleep());
     t1.start();
     t1.interrupt();
	}
}
