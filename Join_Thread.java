package com.java.multithread;

class FixOrder extends Thread{
	public void run() {
		System.out.println("fix the order");
	}
}
class PackOrder extends Thread{
	public void run() {
		System.out.println("Packing product");
	}
}
class DeleverOrder extends Thread{
	public void run() {
		System.out.println("Delever the product");
	}
}

public class Join_Thread {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new FixOrder());
		
		Thread t2 = new Thread(new PackOrder());
		
		Thread t3 = new Thread(new DeleverOrder());
		t2.start();
	    t1.join();
		t1.start();
		t3.start();
		t2.join();
		
		
	}
	

}
