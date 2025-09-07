package com.multithreading.order;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Drawing extends Thread{
//	String name;
	ReentrantLock lock = new ReentrantLock();
	public Drawing(String name) {
		super(name);
	}
	public void run(String name) {
		try {
			if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
				for (int j = 0; j <= 9; j++) {
					System.out.print("Playing "+j+" : ");
					try {
						Thread.sleep(12000);
						System.out.println("complete lock release");
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					finally {
						lock.unlock();
					}
					System.out.println(name);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ReentrantLockExample {
	public static void main(String[] args) {
		Drawing dw = new Drawing("Utkarsh");
		Drawing dw2 = new Drawing("Abhinav");
		dw.start();
		dw2.start();

	}

}
