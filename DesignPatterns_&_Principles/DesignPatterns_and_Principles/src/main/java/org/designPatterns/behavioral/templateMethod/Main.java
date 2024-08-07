package org.designPatterns.behavioral.templateMethod;

public class Main {

    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        class1.templateMethod();
        AbstractClass class2 = new ConcreteClass2();
        class2.templateMethod();
    }
}
