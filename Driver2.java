package com.java.multithread;

class EvenNumber extends Thread {
	@Override
	public void run() {
		for (int i = 10; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number " + i);
			}

		}
	}
}

class OddNumber extends Thread {
	@Override
	public void run() {
		for (int i = 10; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd Number " + i);
			}

		}
	}
}

public class Driver2 {
	public static void main(String[] args) {
		
		EvenNumber e1 = new EvenNumber();

		e1.start();

	}

}
