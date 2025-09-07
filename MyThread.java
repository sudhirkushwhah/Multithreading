package com.kodewala.academy;

class Mythread1 extends Thread {
	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println("Playing" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Mythread2 extends Thread { 
	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println("Playing --------- ");
		}
	}
}

public class MyThread {

	public static void main(String[] args) {

		Thread.currentThread().getName();
		Thread t1 = new Thread(new Mythread1());
		t1.start();

		Thread t2 = new Thread(new Mythread2());
		t2.start();

	}

}
