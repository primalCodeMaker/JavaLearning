package org.designPatterns.abstractFacory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing: " + this.getClass());

    }
}

