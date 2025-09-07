package com.kodewala.academy;

class Testing {
	public synchronized void runingSum() {
		for (int i = 0; i <= 8; i++) {
		
			synchronized (this) {
				
				for (int j=0;i<=5;i++) {
					System.out.println("sum :" + i + 6);
				}
			}
		}
	}

	public synchronized void runingDiv() {
		for (int i = 0; i <= 8; i++) {
			synchronized (this) {
				if (i % 2 != 0) {
					System.out.println("Div :" + i + 6);
				}
			}
		}
	}
}

class TestTwo extends Thread {
	Testing testing;

	public TestTwo(Testing testing) {
		this.testing = testing;
	}

	@Override
	public void run() {
		Testing testing2 = new Testing();
		testing2.runingSum();
	}
}

class TestTwo2 extends Thread {
	Testing testing;

	public TestTwo2(Testing testing) {
		this.testing = testing;
	}

	@Override
	public void run() {
		Testing testing3 = new Testing();
		testing3.runingDiv();
	}
} 

public class ProgramStaticBlock {
	public static void main(String[] args) {
		Testing t1 = new Testing();
		TestTwo t2 = new TestTwo(t1);
		
		t2.start();
		TestTwo t3 = new TestTwo(t1);
		
		t3.start();
	}
}
