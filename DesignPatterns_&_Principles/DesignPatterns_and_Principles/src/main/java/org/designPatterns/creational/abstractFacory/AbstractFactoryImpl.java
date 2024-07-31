package org.designPatterns.creational.abstractFacory;

public class AbstractFactoryImpl {


    public static AbstractFactory getFactory(String whatFactory) {

        if (whatFactory == null) {
            return null;
        }
        if (whatFactory.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        }
        if (whatFactory.equals("Color")) {
            return new ColorFactory();
        }
        return null;
    }
}
