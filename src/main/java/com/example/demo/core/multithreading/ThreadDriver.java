package com.example.demo.core.multithreading;

import com.example.demo.core.multithreading.tl.MyThreadLocal;

import java.util.concurrent.*;
import java.util.function.Function;

public class ThreadDriver {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//
//        ThreadGroup tg = new ThreadGroup("Akshay");
//        tg.setMaxPriority(10);
//        System.out.println(tg.getParent().getParent().getName());
//        Locking locking = new Locking();
//        MyThread r1 = new MyThread(locking);
//        MyThread r2 = new MyThread(locking);
//        MyThread r3 = new MyThread();
//
//           Thread t1 = new Thread(tg,r1);
//           Thread t2 = new Thread(tg,r2);
//           Thread t3 = new Thread(tg,r3);
////           t1.start();
////           t2.start();
////           Thread.sleep(3000);
////           synchronized (locking){
////               locking.notifyAll();
////           }
//
//        tg.list();
////        System.out.println(tg.enumerate());
//
//        tg.setMaxPriority(10);
//
//        t1.start();
//
//        tg.setMaxPriority(8);
//
//        t2.start();
//
//        ExecutorService es = Executors.newCachedThreadPool();
//        Future f = es.submit(r1);
//        Callable c= ()->"Result";
//        Future<String> f1 =  es.submit(c);
//        System.out.println(f1.get());


//        MyThreadLocal tl = new MyThreadLocal();
//        System.out.println(tl.tl.get());
        Runtime.getRuntime().addShutdownHook(new Thread(()-> System.out.println("SH called")));
//        System.exit(0);
//        Function

    }
}
