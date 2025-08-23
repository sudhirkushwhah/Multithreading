package com.java.multithread;

public class Driveer {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		t1.start();
		Thread.currentThread().getName();

	}

}

class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println("run method");
	}
}
