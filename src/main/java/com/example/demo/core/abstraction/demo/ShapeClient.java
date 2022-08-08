package com.example.demo.core.abstraction.demo;

public class ShapeClient implements Shape{

    @Override
    public void shapeDetails() {

    }

    public static final strictfp synchronized void main(String[] args) {
        Shape shape = new ShapeClient();

        System.out.println(shape.displayClassname());

        System.out.println(Shape.getShapeParams());

    }
}
