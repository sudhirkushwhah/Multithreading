package com.java.multithread;

class Mythread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Child thread");
			Thread.yield();
		}
	}
}

public class DemoYieldThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Mythread());
		t1.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("main thread");
		}
	}

}
