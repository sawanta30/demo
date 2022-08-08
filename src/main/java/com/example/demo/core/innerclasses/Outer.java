package com.example.demo.core.innerclasses;

public class Outer {
    int a = 1;
    static int b = 50;
    private  class Inner {
        int a = 10;

        public void m1(){
            int a = 100;
            System.out.println(a);
            System.out.println(b);
            System.out.println(this.a);
            System.out.println(Outer.b);
        }

    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.new Inner();
        inner.m1();

    }
}
