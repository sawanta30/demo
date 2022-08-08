package com.example.demo.core.abstraction.demo;

public abstract class Vehicle {

    private String vehicleNumber;
    private int vehicleBand;
    private String color;

    public abstract void start();
    public abstract void stop();

    private int getGears(){
        return 5;
    }
    public int getWheels(){
        return 5;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleBand() {
        return vehicleBand;
    }

    public void setVehicleBand(int vehicleBand) {
        this.vehicleBand = vehicleBand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
