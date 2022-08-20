package com.example.demo.core.Interview.morganstanley.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class LockingDemo {


    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        String s = new String("Akshay");

        if (lock.tryLock()){
            System.out.println(lock.isLocked());
            System.out.println(lock.getHoldCount());
            lock.lock();
            System.out.println(lock.isFair());
            System.out.println(lock.getHoldCount());
            lock.unlock();
            System.out.println(lock.isLocked());
            lock.unlock();
            System.out.println(lock.isLocked());
        }
    }
}
