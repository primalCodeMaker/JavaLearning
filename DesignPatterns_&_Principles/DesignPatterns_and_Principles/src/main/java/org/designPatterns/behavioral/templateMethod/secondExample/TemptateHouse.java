package org.designPatterns.behavioral.templateMethod.secondExample;

public abstract class TemptateHouse {


    protected final void buildHouse() {
        digHole();
        buildFoundation();
        buildWalls();
        makeRoof();
        insertWindows();
    }

    void digHole() {
        System.out.println("Dig Hole");
    }

    protected abstract void buildFoundation();
    protected abstract void buildWalls();
    protected abstract void makeRoof();
    protected abstract void insertWindows();
}
