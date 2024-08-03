package org.designPatterns.structural.decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        System.out.println("Adding additional functionality in ConcreteDecorator1");
    }
}
