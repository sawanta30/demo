package com.example.demo.concurrency.executorService.threadloal;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LocalClient {

    public static void main(String[] args) {
        LocalThread lt1 = new LocalThread("abcd-fdsg");
        LocalThread lt2 = new LocalThread("xyzd-fdsg");


        ScheduledExecutorService sc1 = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService sc2 = Executors.newSingleThreadScheduledExecutor();
        sc1.scheduleAtFixedRate(lt1,1,2, TimeUnit.SECONDS);
        sc2.scheduleAtFixedRate(lt2,2,2, TimeUnit.SECONDS);


    }
}
