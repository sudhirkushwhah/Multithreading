package com.java.multithread;

class Run implements Runnable {
    @Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			if (i % 2 == 0) {
				System.out.println("even : " + i * 5);
			}
		}

	}

}

class Run2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			if(i/2 > 0) {
				System.out.println("print number : "+i*2);
			}
		}
	}
}

public class Runnable_Thread2 {
	public static void main(String[] args) throws InterruptedException {
		Run r1 = new Run();
	    Thread t1 = new Thread(r1);
	    t1.start();
	    
	    Run2 r2 = new Run2();
	    Thread t2 = new Thread(r2);
	    t2.start();
	    
		
	}

}
