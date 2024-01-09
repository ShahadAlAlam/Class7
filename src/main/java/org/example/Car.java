package org.example;

public class Car extends Vehicle {
    Car(){
        super();
    }
    public Car(int wheels, boolean hasEngine) {
        super(wheels, hasEngine);
//        this.wheels = wheels;
//        this.hasEngine = hasEngine;
    }

    public int getWheels() {
        return super.getWheels();
    }

    public void setWheels(int wheels) {
        super.setWheels(wheels);
    }

    public boolean isHasEngine() {

        return super.isHasEngine();
    }

    public void setHasEngine(boolean hasEngine) {
        super.setHasEngine(hasEngine);
    }


    public void move(){
        System.out.println("Car is moving on "+super.getWheels()+" wheels and has "+(super.isHasEngine()==true?" engine":" no engine"));
    }
}
