package org.designPatterns.creational.abstractFacory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = AbstractFactoryImpl.getFactory("Shape");
        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Square");
        shape1.draw();
        shape2.draw();

        AbstractFactory colorFactory = AbstractFactoryImpl.getFactory("Color");
        Color color1 = colorFactory.getColor("Red");
        Color color2 = colorFactory.getColor("Blue");
        color1.fill();
        color2.fill();
    }
}
