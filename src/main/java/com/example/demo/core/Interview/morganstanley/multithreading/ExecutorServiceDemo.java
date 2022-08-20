package com.example.demo.core.Interview.morganstanley.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {


    public static void main(String[] args) {
        List<Runnable> jobs = new ArrayList<>();
        for (int i=0;i<10;i++){
            jobs.add(new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
                System.out.println(Runtime.getRuntime().availableProcessors());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }));
        }

        ExecutorService executorService  = Executors.newFixedThreadPool(5);
        jobs.forEach(executorService::execute);
        try {
           if (executorService.awaitTermination(10,TimeUnit.SECONDS))
               executorService.shutdown();
           else
               executorService.shutdownNow();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
