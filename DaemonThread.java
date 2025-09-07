package com.multithreading.order;

class Daemon extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 9; i++) {
			System.out.println("Daemon thread :" + i + ", name of the thread :" + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

public class DaemonThread {
	public static void main(String[] args) {
		Daemon daemon = new Daemon();
		daemon.setDaemon(true);
		daemon.start();
		System.out.println(Thread.currentThread().isDaemon());

		System.out.println("this is inside main mathod");
	}
}
