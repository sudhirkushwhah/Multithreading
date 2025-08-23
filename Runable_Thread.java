package com.java.multithread;

class Print implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Runnable class");
		}
	}
}

public class Runable_Thread {
	public static void main(String[] args) {
		Print t1 = new Print();
		Thread t2 = new Thread(t1);
		t2.start();
		System.out.println(Thread.currentThread().getName());
		
	}

	

}
