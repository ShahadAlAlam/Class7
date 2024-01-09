package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Bus b = new Bus(4,true);
//        Car c = new Car(4,true);
//        Rikshaw r = new Rikshaw(3,false);
//        b.move();
//        c.move();
//        r.move();
//        Cycle cyc= new Cycle(2,false);
//        cyc.move();
//        Truck t = new Truck(4,true);
//        t.move();
        List<Vehicle> v = new ArrayList<>();
        v.add(new Bus(4,true));
        v.add(new Car(4,true));
        v.add(new Rikshaw(3,false));
        v.add(new Cycle(2,false));
        v.add(new Truck(4,true));
        for(Vehicle veh:v){
            veh.move();
            veh.sounds();
        }
//        System.out.println("Hello world!");
    }
}