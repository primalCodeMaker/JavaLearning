package org.designPatterns.creational.abstractFacory;

public class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println("Drawing: " + this.getClass());

    }
}
