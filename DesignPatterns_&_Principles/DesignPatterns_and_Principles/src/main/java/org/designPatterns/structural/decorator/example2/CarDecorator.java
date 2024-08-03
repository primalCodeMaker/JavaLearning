package org.designPatterns.structural.decorator.example2;


public abstract class CarDecorator implements Car {

    private final Car car;

    public CarDecorator(Car car) {
        System.out.println(" caling abstract CarDecorator constructor ");
        this.car = car;
    }

    @Override
    public String create() {
        System.out.println(" calling abstract CarDecorator create() ");
        return car.create();
    }
}
