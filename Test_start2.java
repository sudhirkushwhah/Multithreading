package com.java.multithread;

public class Test_start2 {
	public static void main(String[] args) {
		Car2 c = new Car2();
		c.start();
		System.out.println("some spaces");
		c.start();
	}

}
class Car2 extends Thread{
	@Override
	public void run() {
		System.out.println("run playing");
	}
}
