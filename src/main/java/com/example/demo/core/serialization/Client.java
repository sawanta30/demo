package com.example.demo.core.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Client {

    public static void main(String[] args) {
    Employee e1 = new Employee(1,"Akshay");
    try {
        FileOutputStream fos = new FileOutputStream("Data/employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(e1);

        oos.close();
        fos.close();


    }catch(IOException e){
        System.out.println(e.getMessage());
    }finally{
        System.out.println("Serialization done !");
    }

    }
}
