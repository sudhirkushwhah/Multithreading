package com.kodewala.academy;
class Dell {
	public static synchronized void display(String name) {
		for(int i=0;i<=10;i++) {
			System.out.print("brand :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
class MultiThread extends Thread{
	Dell dell;
	String name;
	public MultiThread(Dell dell, String name) {
		this.dell=dell;
		this.name=name;
	}
	@Override
	public void run() {
		Dell.display(name);
	}
}

public class Laptop {
	public static void main(String[] args) {
		Dell dell = new Dell();
		Dell dell2 = new Dell();
		MultiThread t1 = new MultiThread(dell, "Lenovo");
		MultiThread t2 = new MultiThread(dell2, "Acer");
		t1.start();
		t2.start();
	}

}
