package com.multithreading.order;

class Counter {
	private static int count = 0;
   
	public synchronized void increment() {
		count++;
	}
	// non synchronized different count ever time
	public void increment_2() {
		count++;
	}

	public static int getCount() {
		return count;
	}

}

class Mythread extends Thread {
	Counter counter;

	public Mythread(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			counter.increment();
			
		}
	}
}

public class Syn_CounterTest {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Mythread t1 = new Mythread(c1);
		Mythread t2 = new Mythread(c1);
		Mythread t3 = new Mythread(c1);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
        System.out.println("synchronized count block give the constant output count ");
		System.out.println(Counter.getCount());
	}
}
//output --------- 3003 