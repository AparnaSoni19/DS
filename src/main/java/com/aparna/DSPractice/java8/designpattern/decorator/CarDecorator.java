package com.aparna.DSPractice.java8.designpattern.decorator;

public class CarDecorator implements Car{
    protected Car car;
    public CarDecorator(Car c)
    {
        this.car=c ;
    }
    @Override
    public void assemble() {
        System.out.println("Decorator");
        car.assemble();
    }
}
