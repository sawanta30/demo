package com.example.demo.core.Interview.morganstanley.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {


    public static void main(String... args) {
        Semaphore sm = new Semaphore(1);
        MySemaphoreThread t1 =new MySemaphoreThread(sm,"Akshay");
        MySemaphoreThread t2 =new MySemaphoreThread(sm,"Bharat");
        Runtime.getRuntime().addShutdownHook(new Thread(()-> System.out.println("ShutDownhook called")));
        t1.start();
        t2.start();

    }
}
