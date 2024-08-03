package org.designPatterns.structural.bridge;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(PizzaMaker pizzaMaker) {
        super(pizzaMaker);
    }

    public void preparePizza() {
        System.out.println("Preparing Pepperoni pizza");
        pizzaMaker.make();
    }
}
