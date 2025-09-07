package com.multithreading.order;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class Fixed {
    public void player() {
        try {
            if (MyPoint.lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
                System.out.println("Pointer pointing the thread start");
                Thread.sleep(2000);
                MyPoint.lock.unlock();
                System.out.println("find the thread");
            } else {
                System.out.println("Second thread start to point");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyPoint extends Thread {
    static ReentrantLock lock = new ReentrantLock();
    Fixed fixed;

    public MyPoint(Fixed fixed) {
        this.fixed = fixed;
    }

    @Override
    public void run() {
        fixed.player();
    }
}

public class ReentrantPlay {
    public static void main(String[] args) {
        Fixed fixed = new Fixed();
        MyPoint t1 = new MyPoint(fixed);
        MyPoint t2 = new MyPoint(fixed);

        t1.start();
        t2.start();
    }
}
