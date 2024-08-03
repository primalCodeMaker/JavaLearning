package org.designPatterns.structural.decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        System.out.println("Adding additional functionality in ConcreteDecorator2");
    }
}
