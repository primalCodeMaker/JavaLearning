package org.designPatterns.behavioral.observer.newsleetterNormalAndLambda;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

}
