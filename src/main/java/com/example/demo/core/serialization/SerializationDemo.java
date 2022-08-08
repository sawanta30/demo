package com.example.demo.core.serialization;

import java.io.*;

public class SerializationDemo {
    public static final synchronized strictfp void main(String ... args) throws IOException, ClassNotFoundException {
        MySerializationClass c = new MySerializationClass(10,"Akshay",500);
        FileOutputStream fos = new FileOutputStream("Data/data.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        c.writeExternal(oos);
        oos.close();
        fos.close();
        FileInputStream fis = new FileInputStream("Data/data.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        c.readExternal(ois);

        fis.close();
        ois.close();
    }
}
