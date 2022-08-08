package com.example.demo.core.innerclasses.methodinner;

public class MethodOuter {
    int a = 10;
    static int b = 20;

    public static void m1(){
        class MethodInner{
            public void innerMethod(){
                System.out.println("from method inner class");
            }

        }
        MethodInner inner = new MethodInner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        m1();
    }
}
