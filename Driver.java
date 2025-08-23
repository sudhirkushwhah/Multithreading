package com.java.multithread;

class Odd extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd number : " + i);
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Even extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("even number : " + i);
			}
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Driver {
	public static void main(String[] args) {
		Odd o1 = new Odd();
		Even e1 = new Even();
		e1.start();
		o1.start();

	}

}
