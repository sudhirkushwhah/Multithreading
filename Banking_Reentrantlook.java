package com.multithreading.order;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankActive extends Thread{
	static ReentrantLock lock = new ReentrantLock();
 	public BankActive(String name) {
		super(name);
	}
 	int amount;
	private double balance= 5000;
	public void run() 
	{
		do {
			try 
			{
				if(lock.tryLock(6000, TimeUnit.MILLISECONDS)) {
				System.out.println("total balance is :"+balance);
				if (amount <= balance && balance > 0) 
				{
					try {
						Thread.sleep(30000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					balance -= amount;
					System.out.println("remaing balance after withdrawl :"+balance);
					lock.unlock();
					System.out.println("relese lock first bank");
					break;
				}else {
					System.out.println(Thread.currentThread().getName()+"insufficient balance");
				}
				}else {
					System.out.println("fund not found");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (true);
	}
}

public class Banking_Reentrantlook {
	public static void main(String[] args) {
		BankActive bank = new BankActive("SBI");
		BankActive bank2 = new BankActive("ICICI");
		bank.start();
		bank2.start();
	
		
	}

}
