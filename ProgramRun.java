package com.kodewala.academy;
class Playing extends Thread{
	public synchronized void runingSum() {
		for (int i = 0; i <= 8; i++) {
			synchronized (this) {
				if (i % 2 == 0) {
					System.out.println("sum :" + i + 6);
				}
			}
		}
	}
	
}


public class ProgramRun {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Playing());
		t1.start();
		
	}
	
	

}
