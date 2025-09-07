package com.kodewala.academy;

class Vichele {
	public static synchronized void bike() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Riding");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public static synchronized void car() {
		for(int j=65;j<=71;j++) {
			System.out.println((char)j);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void train() {
		for(int j=65;j<=70;j++) {
			System.out.println(j);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class MyVichele extends Thread{
	Vichele vichele;
	public MyVichele(Vichele vichele) {
		this.vichele=vichele;
	}
	public void run() {
		Vichele.bike();
	}
}
class MyVichele2 extends Thread{
	Vichele vichele;
	public MyVichele2(Vichele vichele) {
		this.vichele=vichele;
	}
	public void run() {
		Vichele.car();
	}
}
class MyVichele3 extends Thread{
	Vichele vichele;
	public MyVichele3(Vichele vichele) {
		this.vichele=vichele;
	}
	public void run() {
		Vichele.train();
	}
}


public class Transport {
	public static void main(String[] args) {
		Vichele vec = new Vichele();
		MyVichele t1 = new MyVichele(vec);
		
		MyVichele2 t2 = new MyVichele2(vec);
		MyVichele3 t3 = new MyVichele3(vec);
		t1.start();
	
		t2.start();
		t3.start();
	}

}
