package org.designPatterns.creational.abstractFacory;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Filling with " + this.getClass() + "Color");
    }
}
