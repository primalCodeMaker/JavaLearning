package org.designPatterns.behavioral.chainOfResponsibility.secondExample;

import java.util.List;

public class ChainRunner {

    private final CarHandler carHandler;

    // w konstruktorze klasy tworzymy instancje kazdego ogniwa
    public ChainRunner() {
        this.carHandler = new CabrioletHandler();
        CarHandler handler2 = new JeepHandler();
        CarHandler handler3 = new ColorHandler();
        CarHandler handler4 = new EquipmentHandler();
        CarHandler handler5 = new QualityCheckHandler();

        // wiazemy ogniwa ze soba
        carHandler.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(handler4);
        handler4.setNextHandler(handler5);
        handler5.setNextHandler(null);
    }

    public static void main(String[] args) {

        ChainRunner chainRunner = new ChainRunner();
//        chainRunner.carHandler.handle(Car.lombook(Car.Type.CABRIOLET, "Blue", List.of("Steering Wheel")));
        chainRunner.carHandler.handle(Car.lombook(Car.Type.JEEP, "Black", List.of("Wheels")));

        // nullPointerException
//        chainRunner.carHandler.handle(Car.lombook(Car.Type.CABRIOLET, "Red", List.of(null)));
//        chainRunner.carHandler.handle(Car.lombook(Car.Type.CABRIOLET, "Red2", null));

    }
}
