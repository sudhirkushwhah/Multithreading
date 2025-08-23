package com.java.multithread;

class NewThread extends Thread {
	@Override
	public void run() {
		System.out.println("Playing Utkarsh "+Thread.currentThread().getName());
	}
}

public class PriorityThread {
	public static void main(String[] args) {

		NewThread t1 = new NewThread();
		t1.start();

		t1.setPriority(9);
		System.out.println(t1.getPriority());

		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println(Thread.currentThread().getName());
	}

}
