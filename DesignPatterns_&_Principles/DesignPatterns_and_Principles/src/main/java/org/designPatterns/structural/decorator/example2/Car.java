package org.designPatterns.structural.decorator.example2;

public interface Car {

    default String create(){
        System.out.println("calling Interface Car create() return null ");
        return null;
    }

}
