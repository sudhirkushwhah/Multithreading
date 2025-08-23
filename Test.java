package com.java.multithread;

public class Test {
	public static void main(String[] args) {
		Student st = new Student();
		st.start();
	}

}

class Student extends Thread{
	@Override
	public void run() {
		System.out.println("run method");
		
		// avoid overloaded method my thread
		//method is overload by different parameters also not allow
		
	}
	public void run(int i) {
		System.out.println("run method 45");
	}
}
