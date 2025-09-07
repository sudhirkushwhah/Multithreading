package com.kodewala.academy;


class Score implements Runnable{

	@Override
	public synchronized void run() {
		for(int i=1;i<=4;i++) {
			System.out.println("First team Score "+ i +" : "+i*53);
		}
		
	}
	
}
class Score2 implements Runnable{

	@Override
	public synchronized void run() {
		for(int i=1;i<=4;i++) {
			System.out.println("Second team Score "+ i +" : "+i*57);
		}
		
	}
	
}

public class Print_Runable {
	public static void main(String[] args) throws InterruptedException{
		Score s1= new Score();
		Thread t1 = new Thread(s1);
		t1.start();
		
		Score2 s2 = new Score2();
		Thread t2 = new Thread(s2);
		t2.start();
	}

}
