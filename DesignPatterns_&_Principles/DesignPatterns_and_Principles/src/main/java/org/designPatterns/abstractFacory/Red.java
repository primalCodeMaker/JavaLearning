package org.designPatterns.abstractFacory;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Filling with " + this.getClass() + "Color");
    }
}
