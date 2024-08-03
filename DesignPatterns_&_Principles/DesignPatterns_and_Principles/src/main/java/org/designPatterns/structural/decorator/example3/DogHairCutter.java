package org.designPatterns.structural.decorator.example3;

public class DogHairCutter extends Dog {

    public Dog dog;

    public DogHairCutter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String hairCut() {
        return "short hair cutted";
    }
}
