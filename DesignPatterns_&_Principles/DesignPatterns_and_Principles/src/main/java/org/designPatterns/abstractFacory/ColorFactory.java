package org.designPatterns.abstractFacory;

public class ColorFactory implements AbstractFactory {

    @Override
    public Color getColor(String whatFactory) {
        if (whatFactory == null) {
            return null;
        }
        if (whatFactory.equalsIgnoreCase("Blue")) {
            return new Blue();
        }
        if (whatFactory.equalsIgnoreCase("Red")) {
            return new Red();
        }
        return null;
    }


}
