package org.example;

public class Main {
    public static void main(String[] args) {
        Bus b = new Bus();
        Car c = new Car();
        Rikshaw r = new Rikshaw();
        b.move();
        c.move();
        r.move();
        System.out.println("Hello world!");
    }
}