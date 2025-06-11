package com.aparna.DSPractice.java8.designpattern.decorator;

public class SportsCar extends CarDecorator{
    public SportsCar(Car c) {
        super(c);
    }

    public void assemble() {
        car.assemble();
        System.out.println("Add Sports Feature");
    }
}
