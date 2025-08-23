package com.java.multithread;

public class Tester_thread {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.start();
		Thread.currentThread().getName();

	}

}

class Employee extends Thread {

	@Override
	public void run() {

		System.out.println("playing football");

	}
}
