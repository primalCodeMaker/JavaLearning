package org.designPatterns.structural.decorator.example1_basic;

public class Main {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operation();
    }

}
