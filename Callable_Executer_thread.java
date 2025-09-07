package com.multithreading.order;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallDrive implements Callable<Integer>{
    @Override
	public Integer call() throws Exception{
    	for(int i=0;i<=9;i++) {
    		System.out.println("number is :"+i + "current thread :"+Thread.currentThread().getName());
    	}
		return 458268;
	}
	
}

public class Callable_Executer_thread {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i=0;i<=5;i++) {
			Future<Integer> futint = executorService.submit(new CallDrive());
			Integer futInteger = futint.get();
			System.out.println(futInteger);
		}
	}

}
