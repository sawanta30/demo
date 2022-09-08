package com.example.demo.concurrency;

public class MyThread extends Thread{

    private Thread thread;
    private String name;

    public MyThread(Thread thread, String name) {
        super(name);
        this.thread = thread;
        this.name = name;
    }

    @Override
    public void run() {
        if (thread != null){
            try {
                System.out.println(name+" calling join on "+thread.getName());
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println(name + " Running");
    }
}
