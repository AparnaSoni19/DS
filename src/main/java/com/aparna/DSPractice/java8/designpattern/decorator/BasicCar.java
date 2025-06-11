package com.aparna.DSPractice.java8.designpattern.decorator;

public class BasicCar implements  Car{
    @Override
    public void assemble() {
        System.out.println("Basic car feature added");
    }
}
