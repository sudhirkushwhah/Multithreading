package com.multithreading.order;

class Consumer {
	private double balance = 1000;
	// private double amount;

	public void doDeposite(double amount) {

		for (int j = 1; j <= 4; j++) {
			System.out.println("Paying by Gpay");
		}
		synchronized (this) {
			for (int i = 1; i <= 3; i++) {
				if (amount > 0) {
					balance -= amount;
					System.out.println("balance is " + i + ":" + balance);
				}
			}
		}
	}
}

class PaySystem extends Thread {
	Consumer consumer;

	public PaySystem(Consumer consumer) {
		this.consumer = consumer;
	}

	@Override
	public void run() {
		consumer.doDeposite(2000);
	}
}

public class UBIN_Bank {
	public static void main(String[] args) {
		Consumer c = new Consumer();

		PaySystem t1 = new PaySystem(c);
		PaySystem t2 = new PaySystem(c);
		t1.start();
		t2.start();
	}
}
