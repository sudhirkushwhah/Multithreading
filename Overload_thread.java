package com.java.multithread;

public class Overload_thread {
	public static void main(String[] args) {
		Coll t1 = new Coll();
		t1.start();
	}

}

class Coll extends Thread{
	@Override
	public void run() {
		System.out.println("start method");
	}
	@Override
	public void start() {
		System.out.println("run method");
	}
}
