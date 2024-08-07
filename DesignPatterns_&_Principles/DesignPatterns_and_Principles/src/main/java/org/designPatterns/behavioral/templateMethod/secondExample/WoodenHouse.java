package org.designPatterns.behavioral.templateMethod.secondExample;

public class WoodenHouse extends TemptateHouse {

    @Override
    protected void buildFoundation() {
        System.out.println("Wooden House buildFoundation()");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Wooden House buildWalls()");
    }

    @Override
    protected void makeRoof() {
        System.out.println("Wooden House makeRoof()");
    }

    @Override
    protected void insertWindows() {
        System.out.println("Wooden House insertWindows()");
    }
}
