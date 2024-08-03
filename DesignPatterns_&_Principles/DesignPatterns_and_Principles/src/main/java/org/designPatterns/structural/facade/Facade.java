package org.designPatterns.structural.facade;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Facade {

    private final ConcreteComplexSystem complexSystem;


    public void simpleOperation() {
        System.out.println("Performing a simple operation using the complex system");
        complexSystem.method1();
    }

    public void complexOperation() {
        System.out.println("Performing a complex operation using the complex system");
        complexSystem.method1();
        complexSystem.method2();
        complexSystem.method3();
        complexSystem.secondMethod1();


    }
}
