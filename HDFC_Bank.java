package com.multithreading.order;

class User {
	private double balance = 1000;

	public synchronized void deposite(int amount) {
		for (int i = 0; i <= 5; i++) {
			if (amount > 0) {
				balance = balance + amount;
				System.out.println("Deposite amount " + amount + " net balance : " + balance);
			} else {
				System.out.println("invalid amount");
			}
		}
	}

	public synchronized void withdraw(int amount) {
		for (int j = 0; j <= 5; j++) {
			if (amount > 0 && amount <= balance) {
				balance -= amount;
				System.out.println("Withdraw amount " + amount + " net balance : " + balance);
			} else {
				System.out.println("Insufficient funds or invalid amount");
			}
		}
	}

}

class Customer extends Thread {
	User user;

	public Customer(User user) {
		this.user = user;

	}

	@Override
	public void run() {
		user.deposite(500);
	}
}

class Customer2 extends Thread {
	User user;

	public Customer2(User user) {
		this.user = user;

	}

	@Override
	public void run() {
		user.withdraw(200);
	}
}

public class HDFC_Bank {
	public static void main(String[] args) {
		User user = new User();
		Customer t1 = new Customer(user);
		Customer t3 = new Customer(user);
		Customer2 t2 = new Customer2(user);
		t1.start();
		t2.start();
		t3.start();

	}
}
