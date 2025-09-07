package com.multithreading.order;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Testing implements Runnable {
	int i;
	public Testing(int i) {
		this.i=i;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 25; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ExecuterFramework {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
	//	ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i <= 2; i++) {
			executorService.execute(new Testing(i));
		}
	}
}
