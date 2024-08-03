package org.designPatterns.structural.facade;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade(new ConcreteComplexSystem());
        facade.simpleOperation();
        facade.complexOperation();

    }
}
