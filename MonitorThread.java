package com.multithreading.order;

class Display {
	public void doPlay() {
		for (int j = 1; j <= 5; j++) {
			System.out.println(j);
		}
		for (int k = 20; k <= 25; k++) {
			System.out.println("number : " + k);
		}
		synchronized (this) {
			for (int i = 65; i <= 70; i++) {
				System.out.println((char) i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Play extends Thread{
	Display display;
	public Play(Display display) {
		this.display = display;
	}
	@Override
	public void run() {
		display.doPlay();
	}
}

public class MonitorThread {
	public static void main(String[] args) {
		Display display= new Display();
		Play t2 = new Play(display);
		Play t1 = new Play(display);
		t2.start();
		t1.start();
	}

}
