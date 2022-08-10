package com.example.demo.core.singletonebreaking;

import java.io.Serializable;

public class MySingleton implements Serializable, Cloneable {

    private static MySingleton mySingleton;

    private MySingleton(){

    }

    public static MySingleton getInstance(){
        if (mySingleton == null)
            mySingleton = new MySingleton();
        return mySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
