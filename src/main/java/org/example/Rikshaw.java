package org.example;

public class Rikshaw extends Vehicle{
    Rikshaw(){
        super();
    }
    public Rikshaw(int wheels, boolean hasEngine) {
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
        System.out.println("Rikshaw is moving on "+super.getWheels()+" wheels and has "+(super.isHasEngine()==true?" engine":" no engine"));
    }
}
