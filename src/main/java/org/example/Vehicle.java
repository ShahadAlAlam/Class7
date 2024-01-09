package org.example;

public abstract class Vehicle {
    private int wheels;

    private boolean hasEngine;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    Vehicle(){

    }
    Vehicle(int wheels,boolean hasEngine){
        this.wheels = wheels;
        this.hasEngine = hasEngine;
    }

    public abstract void move();
    public void sounds(){
        System.out.println("bhrom bhrom");
    };
}
