package com.kodewala.academy;
class Singing{
	public void sing(String name) {
		for(int i=0;i<=5;i++) {
			System.out.println("Song by : ");
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name);
	}
}
class Singer extends Thread{
	Singing singing;
	String name;
	public Singer(Singing singing, String name) {
		this.singing = singing;
		this.name = name;
	}
	@Override
	public void run() {
		singing.sing(name);
	}
}

public class SyncMethod {
	public static void main(String[] args) {
		Singing sin = new Singing();
		Singer t1 = new Singer(sin, "Sonu Nigam");
		Singer t2 = new Singer(sin, "Arjit Singh");
	
		t1.start();
		t2.start();
	}

}
