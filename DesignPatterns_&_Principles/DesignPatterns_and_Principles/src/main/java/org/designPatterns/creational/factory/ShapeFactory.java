package org.designPatterns.creational.factory;


public class ShapeFactory implements Shape {

    Shape shape1 = (() -> nothink());

    public Shape getShape(String shape) {
        return switch (shape) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            default -> shape1;
        };
    }

    @Override
    public void draw() {
    }

    public void nothink() {
        System.out.println("nothink is here");


    }
}


// Rozwiązanie w przypadku klasy abstrakcyjnej Shape, gdzie w Swith Case dla default -> przyjmujemy def;
//    Shape def = new Shape() {
//        @Override
//        public void draw() {
//            System.out.println("There is nothing");
//        }
//    };