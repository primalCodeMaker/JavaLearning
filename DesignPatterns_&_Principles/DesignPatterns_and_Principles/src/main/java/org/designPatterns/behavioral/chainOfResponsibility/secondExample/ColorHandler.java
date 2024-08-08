package org.designPatterns.behavioral.chainOfResponsibility.secondExample;

import java.util.Objects;

public class ColorHandler implements CarHandler {

    private CarHandler nextHandler;

    @Override
    public void setNextHandler(CarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Car car) {
        if (Objects.nonNull(car.getColor())) {
            System.out.printf("preparing %s color%n", car.getColor());
            this.nextHandler.handle(car);
        } else {
            this.nextHandler.handle(car);

        }
    }
}
