package com.multithreading.order;

public class DaemonExample {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			System.out.println(i+ "thread name :"+Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.currentThread().setDaemon(true); 
		} catch (IllegalThreadStateException e) {
			System.out.println("throw IllegalThreadStateException");
		}
		
	}

}
