package com.multithreading.order;

class Sum extends Thread {
	int sum = 0;

	public void run() {

		synchronized (this) {
			System.out.println("Calculate sum");
			int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			for (int i = 0; i <= arr.length; i++) {
				sum += i;
			}
			this.notify();
		}
	}
}

public class Intera_comm_Sum {
	public static void main(String[] args) throws InterruptedException {
		Sum s = new Sum();
		s.start();

		synchronized (s) {
			System.out.println("main thread try to call wait() method");
			s.wait();
			System.out.println("main thread got notification");
			System.out.println(s.sum);

		}
	}

}
