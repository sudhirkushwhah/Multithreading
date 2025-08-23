package com.java.multithread;

class Priority extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Utkarsh is sleeping");
		}
		Thread.currentThread().setPriority(MIN_PRIORITY);

	}
}

public class Priority_thread {
	public static void main(String[] args) {
		Priority p1 = new Priority();
		p1.start();
		p1.setPriority(9);
		System.out.println(p1.getPriority());

		for (int i = 0; i <= 10; i++) {
			System.out.println("Now Playing Utkarsh");
		}

	}

}
