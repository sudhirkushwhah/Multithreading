package com.kodewala.academy;

class Player extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=15;i++) {
			System.out.println("PLAY GAME");
		}
	}
}
class Player1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=15;i++) {
			System.out.println("SINGING SONG");
		}
	}
}

public class Print_Thread {
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(new Player());
		t1.start();
		t1.join();
		Thread t2 = new Thread(new Player1());
		t2.start();
		
	}

}
