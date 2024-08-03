package org.designPatterns.structural.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class Pizza {

    protected PizzaMaker pizzaMaker;

    public abstract void preparePizza();
}
