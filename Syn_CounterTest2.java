
package com.multithreading.order;

class Count1 {
	private static int count = 0;

	public void increment_2() {
		count++;
	}

	public static int getCount() {
		return count;
	}

}

class CounterTest extends Thread {
	Count1 count1;

	public CounterTest(Count1 count1) {
		this.count1 = count1;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			count1.increment_2();
		}
	}
}

public class Syn_CounterTest2 {
	public static void main(String[] args) {
		Count1 c1 = new Count1();
		CounterTest t1 = new CounterTest(c1);
		CounterTest t2 = new CounterTest(c1);
		CounterTest t3 = new CounterTest(c1);
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
        
		System.out.println("non synchronization different count every time");
		System.out.println(Count1.getCount());
	}
}

//output in between 0 to 3003 
//1822
//2852
//...
