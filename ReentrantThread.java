package com.multithreading.order;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
	private double balance = 1000;
	private final Lock lock = new ReentrantLock();

	public void withdrawl(int amount) {
		System.out.println(Thread.currentThread().getName() + " trying to withdrawl amount :" + amount);
		try {
			if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
				if (amount <= balance) {
					try {
						System.out.println(Thread.currentThread().getName() + " processing withdrawl amount");
						Thread.sleep(2000);
						System.out.println(Thread.currentThread().getName() + " withdrawl amount");
						balance = balance - amount;
						System.out.println(Thread.currentThread().getName()
								+ " complete withdrawl amount, remining balance is : " + balance);

					} catch (Exception e) {
						System.out.println("Exception");

					} finally {
						lock.unlock();
					}
				} else {
					System.out.println("insufficient balance");
				}
			} else {
				System.out.println(Thread.currentThread().getName() + " could not aquire lock , try again");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class Account extends Thread {
	BankAccount bankAccount;

	public Account(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		bankAccount.withdrawl(200);
	}
}

public class ReentrantThread {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		Account a1 = new Account(b);
		a1.start();
	}
}
