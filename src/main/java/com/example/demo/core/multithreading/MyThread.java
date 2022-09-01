package com.example.demo.core.multithreading;

import java.util.ArrayList;
import java.util.List;

public class MyThread implements Runnable{
    Locking lock;

    public MyThread(Locking lock) {
        this.lock = lock;
    }

    public MyThread() {
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getPriority());
//        try {
//            Thread.currentThread().join();
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println("Interrupted");
//        }

//        synchronized (this.lock){
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//                if (i == 5){
//                    try {
//                        lock.wait();
//                    } catch (InterruptedException e) {
//                        System.out.println("Interrupted");
//                    }
//                }
//            }
//        }
//    }

//    public void m1() throws RuntimeException {
////        throw new Exception();
//    }
    }

}
