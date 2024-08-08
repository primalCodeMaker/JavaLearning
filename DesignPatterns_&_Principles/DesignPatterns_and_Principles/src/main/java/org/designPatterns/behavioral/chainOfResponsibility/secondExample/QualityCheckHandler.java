package org.designPatterns.behavioral.chainOfResponsibility.secondExample;

public class QualityCheckHandler implements CarHandler {

    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Car car) {
        System.out.printf("Checking Quality!%n");

    }
}
