package com.kodewala.academy;

class Drawing {
	public synchronized void doPlay(String name) {
		for (int j = 0; j <= 9; j++) {
			System.out.print("Playing "+j+" : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);

		}

	}
}

class Ownthread extends Thread {
	Drawing drawing;
	String name;

	public Ownthread(Drawing drawing, String name) {
		this.drawing = drawing;
		this.name = name;
	}

	@Override
	public void run() {
		drawing.doPlay(name);
	}

}

public class SynchronizedMethod {
	public static void main(String[] args) {
		Drawing dw = new Drawing();
		Ownthread t1 = new Ownthread(dw, "Cricket");
		Ownthread t2 = new Ownthread(dw, "Football");
	
		t1.start();
		t2.start();

	}

}
