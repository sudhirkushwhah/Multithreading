package com.kodewala.academy;
class Threading{
	private static int sum;

	public static synchronized void add() {
		int a=5;
		int b=7;
		sum = a+b;
		System.out.println("sum is :"+sum);
		System.out.println("sum is: "+sum+3);
		System.out.println("sum is: "+sum+9);
	}
	
	public static synchronized void div() {
		int a=9;
		int b=3;
		sum = a/b;
		System.out.println("divisible is :"+sum);
		System.out.println("divisible is :"+sum+4);
	}
}
class MyThread_sum extends Thread{
	Threading threading;
	
	public MyThread_sum(Threading threading) {
		this.threading = threading;
	}
	@Override
	public void run() {
		Threading.add();
	}
}
class Mythread_div extends Thread{
	Threading threading;
	public Mythread_div(Threading threading) {
		this.threading = threading;
	}
	@Override
	public void run() {
		Threading.div();
	}
}

public class Program_Static {
	public static void main(String[] args) {
		Threading t1 = new Threading();
		Thread t2 = new Thread(new MyThread_sum(t1));
		Thread t3 = new Thread(new Mythread_div(t1));
		t3.start();
		t2.start();
	}

}

