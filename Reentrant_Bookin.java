package com.multithreading.order;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Booking extends Thread {
	static ReentrantLock lock = new ReentrantLock();

	public Booking(String name) {
		super(name);
	}

	@Override
	public void run() {
		do {
			try {
				if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
					System.out.println("Booking is start");
					Thread.sleep(30000);
					lock.unlock();
					System.out.println("booked all ticket");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "try again next day ticket is complete");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
	}
}

public class Reentrant_Bookin {
	public static void main(String[] args) {
		Booking b1 = new Booking("Third class AC");
		Booking b2 = new Booking("Second class non AC");
		b1.start();
		b2.start();
	}

}
