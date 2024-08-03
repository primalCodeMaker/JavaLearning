package org.designPatterns.structural.decorator.example2;


public class Main {

    public static void main(String[] args) {

//        Car carNotDecorated = new CarImpl();
//        System.out.println(carNotDecorated);

        Car car1 = new NeonDecorator(new SpoilerDecorator(new CarImpl()));
        System.out.println();
        System.out.println("    return: " + car1.create());




    }
}
