package com.multithreading.order;

class Calculate {
	public void number(String name) {
		synchronized (this) {
			int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 6 };
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						System.out.println(+arr[i] + " " + arr[j]);
					}
				}
			}
			System.out.println(name);
		}
	}
}

class DriveCal extends Thread {
	Calculate calculate;
	String name;

	public DriveCal(Calculate calculate, String name) {
		this.calculate = calculate;
		this.name = name;
	}

	@Override
	public void run() {
		Calculate calculate2 = new Calculate();
		calculate2.number(name);
	}
}

public class BlockLS_TwoObj {
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		Calculate cal2 = new Calculate();
		DriveCal t1 = new DriveCal(cal, "Duplicate Number");
		DriveCal t2 = new DriveCal(cal2, "Duplicate ");
		t1.start();
		t2.start();

	}

}
