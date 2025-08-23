package com.java.multithread;

public class Threading {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread thread = new Thread(t1);
		thread.start();
		DemoThread t3 = new DemoThread();
		t3.start();

	}

}
class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("playing");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
class DemoThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("now playing");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
