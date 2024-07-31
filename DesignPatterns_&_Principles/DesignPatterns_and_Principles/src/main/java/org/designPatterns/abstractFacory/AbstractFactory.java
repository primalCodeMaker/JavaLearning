package org.designPatterns.abstractFacory;

public interface AbstractFactory {


    default Color getColor(String whatFactory) {
        return null;
    }

    default Shape getShape(String shape) {
        return null;
    }

}
