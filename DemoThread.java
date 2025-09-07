package com.kodewala.academy;

class PrintEven extends Thread{
	@Override
	public  void run() {
		for(int i=0;i<=15;i++) {
			if(i%2==0) {
				System.out.println("even :"+i);
			}
			
		}
	}
}

class PrintOdd extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=15;i++) {
			if(i%2!=0) {
				System.out.println("Odd :"+i);
			}
			
		}
	}
}

public class DemoThread {
	public static void main(String[] args) throws InterruptedException {
		PrintEven e1 = new PrintEven();
		e1.start();
		e1.join();
		PrintOdd o1 = new PrintOdd();
		o1.start();
	}

}
