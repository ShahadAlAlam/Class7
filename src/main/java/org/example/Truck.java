package org.example;

public class Truck extends Bus {
    Truck(){

    }
    public Truck(int wheels, boolean hasEngine) {
        super(wheels,hasEngine);
    }

    @Override
    public int getWheels(){
        return super.getWheels();
    }

    @Override
    public boolean isHasEngine(){
        return super.isHasEngine();
    }
    @Override
    public void move(){
        System.out.println("Truck is moving on "+getWheels()+" wheels and has "+(isHasEngine()==true?" engine":" no engine"));
    }
}
