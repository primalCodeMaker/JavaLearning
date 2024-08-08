package org.designPatterns.behavioral.observer.newsleetterNormalAndLambda;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class NewSubscriber implements Observer {

    private final String username;

    @Override
    public void update(String message) {
        if (Objects.isNull(message)) {
            System.out.printf("%s - Message null%n", username, message);
        } else {
            System.out.printf("%s - Message %s%n", username, message);
        }
    }
}
