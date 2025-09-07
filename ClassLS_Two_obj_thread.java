package com.multithreading.order;
class Performance{
	public static synchronized void play(String name) {
		for(int i=0;i<=5;i++) {
			System.out.print("Hello ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException");
			}
			System.out.println(name);
		}
	}
}
class Performence2 extends Thread{
	Performance performance;
	String name;
	public Performence2(Performance performance, String name) {
		this.performance=performance;
		this.name=name;
	}
	@Override
	public void run() {
		Performance.play(name);
	}

}

public class ClassLS_Two_obj_thread {
	public static void main(String[] args) {
		Performance performance = new Performance();
		Performance performance3 = new Performance();
		Performence2 t1 = new Performence2(performance, "Utkarsh");
		Performence2 t2 = new Performence2(performance3, "Abhinav");
		t1.start();
		t2.start();
		
	}
}
// synchronized class level perform

