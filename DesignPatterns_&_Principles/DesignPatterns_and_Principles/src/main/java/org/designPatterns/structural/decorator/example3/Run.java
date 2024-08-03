package org.designPatterns.structural.decorator.example3;

public class Run {

    public static void main(String[] args) {

        Animal dog1 = new DogHairCutter(new Dog());
        System.out.println(dog1.hairCut());

        Animal dog2 = new Dog();
        System.out.println(dog2.hairCut());
    }
}
