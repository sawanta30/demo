package com.example.demo.core.singletonebreaking;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Breaker {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, CloneNotSupportedException {

        MySingleton ms1 = MySingleton.getInstance();
        MySingleton ms2 = MySingleton.getInstance();
        System.out.println("ms1  : "+ms1);
        System.out.println("ms1 hashcode : "+ms1.hashCode());
        System.out.println("ms2  : "+ms2);
        System.out.println("ms2 hashcode : "+ms2.hashCode());

        System.out.println("----------------Breaking by reflection ------------------------");
        Class<?> mySingletonClass = Class.forName("com.example.demo.core.singletonebreaking.MySingleton");
        Constructor<MySingleton> cons = (Constructor<MySingleton>) mySingletonClass.getDeclaredConstructor();
        cons.setAccessible(true);
        MySingleton ms3 = cons.newInstance();

        System.out.println("ms1  : "+ms1);
        System.out.println("ms1 hashcode : "+ms1.hashCode());
        System.out.println("ms3  : "+ms3);
        System.out.println("ms3 hashcode : "+ms3.hashCode());

        System.out.println("----------------Breaking by Deserialization ------------------------");
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ms1);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        MySingleton ms4 = (MySingleton) ois.readObject();
        ois.close();
        fis.close();

        System.out.println("ms1  : "+ms1);
        System.out.println("ms1 hashcode : "+ms1.hashCode());
        System.out.println("ms4  : "+ms4);
        System.out.println("ms4 hashcode : "+ms4.hashCode());

        System.out.println("----------------Breaking by Clonning ------------------------");
        MySingleton ms5 = (MySingleton) ms1.clone();

        System.out.println("ms1  : "+ms1);
        System.out.println("ms1 hashcode : "+ms1.hashCode());
        System.out.println("ms5  : "+ms5);
        System.out.println("ms5 hashcode : "+ms5.hashCode());


    }
}
