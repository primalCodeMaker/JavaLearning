package org.designPatterns.structural.bridge;

public class MargheritaPizza extends Pizza {

    public MargheritaPizza(PizzaMaker pizzaMaker) {
        super(pizzaMaker);
    }

    public void preparePizza() {
        System.out.println("Preparing Margherita pizza");
        pizzaMaker.make();
    }

}
