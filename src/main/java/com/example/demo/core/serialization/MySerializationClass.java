package com.example.demo.core.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MySerializationClass implements Externalizable {

    int id;
    String name;
    int sal;

    public MySerializationClass(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.write(this.id);
        out.writeObject(this.name);
        out.writeInt(sal);
        out.flush();
        out.close();
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Read "+in.read());
    in.close();
    }
}
