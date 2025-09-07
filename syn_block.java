package com.multithreading.order;

class Item {

	public void sumItem() {
		for (int i = 2; i <= 7; i++) {
			System.out.println(Thread.currentThread().getName() + "####");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		synchronized (this) {
			for (int i = 0; i <= 4; i++) {
				System.out.println("@@@@@@@@@");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}

	public void divItem() {
		for (int i = 2; i <= 7; i++) {
			System.out.println(Thread.currentThread().getName() + "$$$$$");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + "********");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}
}

class Start3 extends Thread {
	Item item;

	public Start3(Item item) {
		this.item = item;
	}

	@Override
	public void run() {
		item.sumItem();
	}
}

class Start2 extends Thread {
	Item item;

	public Start2(Item item) {
		this.item = item;
	}

	@Override
	public void run() {
		item.divItem();
	}
}

public class syn_block {

	public static void main(String[] args) {
		Item item = new Item();
		Start2 t1 = new Start2(item);
		// Start2 t3 = new Start2(item);
		Start3 t2 = new Start3(item);
		t1.start();
		t2.start();
		// t3.start();

	}
}
