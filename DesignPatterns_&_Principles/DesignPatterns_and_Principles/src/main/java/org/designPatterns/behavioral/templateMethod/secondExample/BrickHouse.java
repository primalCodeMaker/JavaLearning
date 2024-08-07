package org.designPatterns.behavioral.templateMethod.secondExample;

public class BrickHouse extends TemptateHouse {

    @Override
    protected void buildFoundation() {
        System.out.println("Brick House buildFoundation()");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Brick House buildWalls()");
    }

    @Override
    protected void makeRoof() {
        System.out.println("Brick House makeRoof()");
    }

    @Override
    protected void insertWindows() {
        System.out.println("Brick House insertWindows()");
    }
}
