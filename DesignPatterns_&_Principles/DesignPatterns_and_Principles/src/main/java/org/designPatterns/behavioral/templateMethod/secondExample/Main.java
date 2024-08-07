package org.designPatterns.behavioral.templateMethod.secondExample;

public class Main {

    public static void main(String[] args) {

        TemptateHouse woodenHouse1 = new WoodenHouse();
        TemptateHouse brickHouse = new BrickHouse();

        woodenHouse1.buildHouse();
        System.out.println();
        brickHouse.buildHouse();
    }
}
