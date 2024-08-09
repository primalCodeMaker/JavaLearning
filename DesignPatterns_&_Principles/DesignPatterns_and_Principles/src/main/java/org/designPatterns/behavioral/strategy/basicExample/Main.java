package org.designPatterns.behavioral.strategy.basicExample;

public class Main {

    public static void main(String[] args) {

        FirstStrategy firstStrategy = new FirstStrategy();
        SecondStrategy secondStrategy = new SecondStrategy();

        Context context1 = new Context(firstStrategy);
        context1.executeStrategy();

        Context context2 = new Context(secondStrategy);
        context2.executeStrategy();

        // Lambda example
        Context context3 = new Context(
                () -> System.out.println("Third strategy executed.")
        );
        context3.executeStrategy();

    }
}
