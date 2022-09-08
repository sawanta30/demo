package com.example.demo.core.Interview.morganstanley.inheritance;

public class Runner {
    public static void main(String[] args) {
       Base x = new Base();
       Base y = new Derived();
       Derived d = new Derived();

        print(x);
        print(y);
        print(d);

        Base.m1();
        Derived.m1();
    }
    public  static void print(Base base){
        base.print();
    }
}
