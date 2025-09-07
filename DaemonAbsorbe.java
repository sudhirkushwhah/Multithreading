package com.multithreading.order;
class MyDaemon extends Thread{
	@Override
	public void run() {
		System.out.println("Playing");
	}
}

public class DaemonAbsorbe {
	public static void main(String[] args) {
		MyDaemon daemon = new MyDaemon();
		daemon.setDaemon(true);
		daemon.start();
		
		// main 
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("this is non daemon ");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setDaemon(true);
		System.out.println(Thread.currentThread().isDaemon());
		
		
	}

}
