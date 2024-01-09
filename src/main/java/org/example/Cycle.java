package org.example;

public class Cycle extends Vehicle {
    Cycle(){
        super();
    }
    public Cycle(int wheels, boolean hasEngine) {
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
        System.out.println("Cycle is moving on "+super.getWheels()+" wheels and has "+(super.isHasEngine()==true?" engine":" no engine"));
    }

    public void sounds(){
        System.out.println("tring tring");
    }
}
