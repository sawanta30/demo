package com.example.demo.core.abstraction.demo;

public class VehicleClient extends Vehicle{

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }
}
