package org.designPatterns.structural.bridge;

public class PepperoniPizzaMaker implements PizzaMaker {

    @Override
    public void make() {
        System.out.println("Making Pepperoni pizza");
    }
}
