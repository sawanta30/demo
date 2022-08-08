package com.example.demo.core.abstraction.demo;

public interface Shape {

    public String abc = "";

    default String displayClassname(){
        return this.getClass().getName();
    }
    public static String getShapeParams(){
       //this.getClass();
        return "Shapes";
    }

    public void shapeDetails();
}
