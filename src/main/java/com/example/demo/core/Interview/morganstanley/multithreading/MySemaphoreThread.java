package com.example.demo.core.Interview.morganstanley.multithreading;

import java.util.concurrent.Semaphore;

public class MySemaphoreThread extends Thread {

    Semaphore sm;
    String name;
    public MySemaphoreThread(Semaphore sm, String name){
       super(name);
        this.sm = sm;
       this.name = name;
    }
    @Override
    public void run() {
        try {
             sm.acquire();
            for (int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            sm.release();
        }
    }

}
