package org.designPatterns.creational.factory;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("SQUARE");

        shape1.draw();
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("lallaa");
        shape3.draw();

        System.out.println(shape1.getClass());
        System.out.println(shape3.getClass());

    }
}
