package org.designPatterns.creational.abstractFacory;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}

