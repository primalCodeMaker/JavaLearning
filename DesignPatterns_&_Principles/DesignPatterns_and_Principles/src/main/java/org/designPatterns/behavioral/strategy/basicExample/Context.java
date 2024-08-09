package org.designPatterns.behavioral.strategy.basicExample;

import lombok.AllArgsConstructor;
@AllArgsConstructor

public class Context {

private final Strategy strategy;

    public void executeStrategy() {
        strategy.execute();
    }
}
