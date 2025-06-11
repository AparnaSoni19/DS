package com.aparna.DSPractice.java8.designpattern.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
//        Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
//        sportsLuxuryCar.assemble();
    }
}
