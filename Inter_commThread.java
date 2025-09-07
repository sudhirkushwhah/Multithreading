package com.multithreading.order;

class ElectricItem extends Thread{
	int electricItem = 0;
	public void run() {
		synchronized (this) {
		   for(int i=0;i<=10;i++) {
			   electricItem = electricItem+i;
		   }
			this.notify();
		}
	}
}

public class Inter_commThread {
	public static void main(String[] args) throws InterruptedException {
		ElectricItem e = new ElectricItem();
	    e.start();

		synchronized (e) {
			System.out.println("main thread ");
			e.wait();
			System.out.println(e.electricItem);
		}
	}

}
