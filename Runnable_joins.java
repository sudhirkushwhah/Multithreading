package com.java.multithread;


class Run3 implements Runnable{
	@Override
	public void run() {
		System.out.println("Utkarsh is sleeping");
	}
}
class Run4 implements Runnable{
	@Override
	public void run() {
		System.out.println("Playing utkarsh");
	}
}
class Runs5 implements Runnable{
	@Override
	public void run() {
		System.out.println("Today is Wednesday");
	}
}

public class Runnable_joins {
	public static void main(String[] args) {
		Runs5 run3 = new Runs5();
		Thread t3 = new Thread(run3);
		t3.start();
		Run3 run1 = new Run3();
		Thread t1 = new Thread(run1);
		t1.start();
		Run4 run2 = new Run4();
		Thread t2 = new Thread(run2);
		t2.start();
		
		
		
	}

}
