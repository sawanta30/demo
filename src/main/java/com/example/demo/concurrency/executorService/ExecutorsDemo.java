package com.example.demo.concurrency.executorService;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsDemo {

    public static void main(String[] args) {
        ScheduledExecutorService es = Executors.newSingleThreadScheduledExecutor();

        es.scheduleAtFixedRate(()->{
            System.out.println(LocalTime.now().getSecond());
        },1,2, TimeUnit.SECONDS);


    }
}
