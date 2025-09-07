package com.kodewala.academy;

class Animal {
	public static synchronized void doHuntering(String name) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Leopard is runing :");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name);
	}
}

class RuningAnl extends Thread {
	Animal animal;
	String name;

	public RuningAnl(Animal animal, String name) {
		this.animal = animal;
		this.name = name;
	}

	@Override
	public void run() {
		Animal.doHuntering(name);
	}
}

public class SynchronizedThread1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal a1 = new Animal();
		RuningAnl t1 = new RuningAnl(a, "Lepord");
		RuningAnl t2 = new RuningAnl(a1, "Zebra");
		t1.start();
		t2.start();

	}

}
