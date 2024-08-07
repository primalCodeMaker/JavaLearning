package org.designPatterns.behavioral.templateMethod.basicExample;

public abstract class AbstractClass {

    public void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
    }
    public abstract void stepOne();
    public abstract void stepTwo();
    public abstract void stepThree();

}
