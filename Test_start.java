package com.java.multithread;

public class Test_start {
	public static void main(String[] args) {
		Car t1 = new Car();
		t1.start();
	}

}
class Car extends Thread{
	@Override
	public void run() {
		super.start();
		System.out.println("run method");
	}
	@Override
	public void start() {
		super.start();
		System.out.println("start menthod");
	}
	
}
