package org.designPatterns.behavioral.strategy.basicExample;

public class SecondStrategy implements Strategy {

    @Override
    public void execute() {
        System.out.println("Second Strategy");
    }
}
