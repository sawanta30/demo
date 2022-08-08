package com.example.demo.core.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    //private static final long serialVersionUID = 12345667;
    private static final String ORG = "ACCENTURE";
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +"ORG="+ORG+
                '}';
    }
}
