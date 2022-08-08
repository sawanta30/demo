package com.example.demo.core.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationClient {

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Data/employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

           Employee e = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println(e);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Deserialization Done !");
        }
    }
}
