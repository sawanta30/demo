package com.example.demo.core.Interview.morganstanley.multithreading;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SheduledExecutorDemo {

    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();

        ses.scheduleWithFixedDelay(()->{
            System.out.println(Thread.currentThread().getName()+"->"+LocalTime.now().format(DateTimeFormatter.ofPattern("ss")));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },1,5, TimeUnit.SECONDS);
        //ses.scheduleWithFixedDelay(()-> System.out.println(System.currentTimeMillis()),1,2, TimeUnit.SECONDS);
    }
}
