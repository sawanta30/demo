package com.example.demo.core.multithreading.tl;

public class MyThreadLocal extends Thread{


    public ThreadLocal<String> tl = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return "Start";
        }
    };
}
