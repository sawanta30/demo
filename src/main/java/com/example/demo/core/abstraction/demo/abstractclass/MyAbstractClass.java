package com.example.demo.core.abstraction.demo.abstractclass;

public abstract class MyAbstractClass {

    public MyAbstractClass(String name) {
        this.name = name;
    }

    private String name;
    public abstract void getName();
}
