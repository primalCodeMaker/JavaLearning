package org.designPatterns.structural.bridge;

public class MargheritaPizzaMaker implements PizzaMaker {

    @Override
    public void make() {
        System.out.println("Making Margherita pizza");
    }
}
