package org.designPatterns.structural.decorator.example1_basic;

public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("Performing operation on the concrete component");

    }
}
