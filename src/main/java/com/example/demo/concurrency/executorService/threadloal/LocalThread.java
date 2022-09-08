package com.example.demo.concurrency.executorService.threadloal;

import java.time.LocalDate;

public class LocalThread implements Runnable{
    private static ThreadLocal<String> myThreadLocal = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return"ThreadLocal initial";
        }
    };
    private final String txId;

    public LocalThread(String txId) {
        this.txId = txId;
    }

    @Override
    public void run() {
        System.out.println(myThreadLocal.get());
        //if (myThreadLocal.get() == null)
            myThreadLocal.set(txId);
    }
}
