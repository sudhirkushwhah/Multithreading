package com.multithreading.order;

class Pointer extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("thread start calculating");
			for (int i = 0; i <= 10; i++) {
				total = total + i;
			}
			System.out.println("thread sending notification");
			this.notify();
		}
	}
}

public class Inter_communication_Thread {
	public static void main(String[] args) {
		Pointer pointer = new Pointer();
		pointer.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (pointer) {
			System.out.println("main thread call wait method");
			try {
				pointer.wait(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main thread got notification");
			System.out.println(pointer.total);
		}
	}
}
