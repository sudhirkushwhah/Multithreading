package com.java.multithread;

class Pointer extends Thread {
	@Override
	public void run() {
		try {
			for(int i=0;i<=10;i++) {
				System.out.println("Playing Bollybol");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted is got");
		}
	}
}

public class Intrrupted_sleep {
	public static void main(String[] args) {
		Pointer t1 = new Pointer();
		t1.start();
		//THREAD INTERRUPTED ANOTHER THREAD
		//MAIN THREAD INTERRUPTED CHILD THREAD
		t1.interrupt();
		System.out.println("main thread is end");

	}
}
