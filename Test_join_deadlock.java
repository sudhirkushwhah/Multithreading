package com.java.multithread;


public class Test_join_deadlock {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
	}

}
