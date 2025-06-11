package com.aparna.DSPractice.java8.designpattern.decorator;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car c) {
        super(c);
    }

    public void assemble() {
        car.assemble();
        System.out.println("Add Luxury Feature");
    }
}
