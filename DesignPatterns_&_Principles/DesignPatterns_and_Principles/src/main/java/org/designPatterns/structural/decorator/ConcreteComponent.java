package org.designPatterns.structural.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("Performing operation on the concrete component");

    }
}
