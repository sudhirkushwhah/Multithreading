package com.kodewala.academy;

class EvenAndOdd1 {
	public Object printOdd;

	public synchronized void printOdd() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd : " + i);
			}
		}
	}

	public synchronized void printEven() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even : " + i);
			}
		}
	}

}

class MyOddThread extends Thread
{
	EvenAndOdd1 evenAndOdd1;

	public MyOddThread(EvenAndOdd1 evenAndOdd1)
	{

		this.evenAndOdd1 = evenAndOdd1;
	}
    @Override
	public void run()
	{
    	evenAndOdd1.printOdd();
	}
}

class MyEvenThread extends Thread
{
	EvenAndOdd1 evenAndOdd1;

	public MyEvenThread(EvenAndOdd1 evenAndOdd1)
	{

		this.evenAndOdd1 = evenAndOdd1;
	}
    @Override
	public void run()
	{
		evenAndOdd1.printEven();
	}
}

public class EvenAndOdd {
	public static void main(String[] args) {
		EvenAndOdd1 evenAndOdd1 = new EvenAndOdd1();
		MyOddThread myOdd = new MyOddThread(evenAndOdd1);
		Thread t1 = new Thread(myOdd);
		t1.start();
       
		MyEvenThread myEven = new MyEvenThread(evenAndOdd1);
		Thread t2 = new Thread(myEven);
		t2.start();

	}

}
