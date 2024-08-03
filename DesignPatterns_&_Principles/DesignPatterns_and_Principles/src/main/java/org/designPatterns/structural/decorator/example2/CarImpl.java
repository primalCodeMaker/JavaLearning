package org.designPatterns.structural.decorator.example2;

public class CarImpl implements Car {


    @Override
    public String create() {
        System.out.println("calling CarImpl create() ");
        return "Car";
    }

    public CarImpl() {
        System.out.println("calling CarImpl constructor ");
    }
}
