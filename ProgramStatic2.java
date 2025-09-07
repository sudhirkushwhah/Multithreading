package com.kodewala.academy;

class Printing {
	public synchronized void playSum() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("sum is :" + i + 6);
				// System.out.println(Thread.currentThread().getName());
			}
		}
	}

	public synchronized void playDiv() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Div is :" + i / 2);
			}
		}
	}
}

class Pointer extends Thread {
	Printing printing;

	public Pointer(Printing printing) {
		this.printing = printing;
	}

	@Override
	public void run() {

		printing.playSum();
	}
}

class Pointer2 extends Thread {
	Printing printing;

	public Pointer2(Printing printing) {
		this.printing = printing;
	}

	@Override
	public void run() {

		printing.playDiv();
	}
}

public class ProgramStatic2 {
	public static void main(String[] args) {
		Printing p1 = new Printing();
		Pointer t1 = new Pointer(p1);

		Pointer2 t2 = new Pointer2(p1);

		t1.start();
		t2.start();

	}

}
