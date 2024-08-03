package org.designPatterns.structural.facade;

class ConcreteComplexSystem implements ComplexSystem {

    public void method1() {
        System.out.println("Method 1 from complex system");
    }

    public void method2() {
        System.out.println("Method 2 from complex system");
    }

    public void method3() {
        System.out.println("Method 3 from complex system");
    }

    @Override
    public void secondMethod1() {
        System.out.println("SecondComplexSystemImpl");
    }
}
