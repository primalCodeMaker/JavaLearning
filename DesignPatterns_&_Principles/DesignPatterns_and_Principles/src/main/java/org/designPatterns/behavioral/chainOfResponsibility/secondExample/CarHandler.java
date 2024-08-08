package org.designPatterns.behavioral.chainOfResponsibility.secondExample;

public interface CarHandler {

    void setNextHandler(CarHandler nextHandler);

    void handle(Car car);
}
