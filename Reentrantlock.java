package com.multithreading.order;

import java.util.concurrent.locks.*;
import java.util.concurrent.*;

class ReendentDemo extends Thread{
	static ReentrantLock lock = new ReentrantLock();
	
	public ReendentDemo(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		do {
			try {
				if (lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + "first thead got lock");
					Thread.sleep(30000);
					lock.unlock();
					System.out.println(Thread.currentThread().getName() + "first thread release lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "Second thread not got lock and try again");
				}
			} catch (Exception e) {
				System.out.println("Exception");
			}
		} while (true);
	}
}

class Reentrantlock {
	public static void main(String[] args) {
		ReendentDemo t1 = new ReendentDemo("Player ");
		ReendentDemo t2 = new ReendentDemo("Pointer ");
		t1.start();
		t2.start();
	}


	

	

	
}
