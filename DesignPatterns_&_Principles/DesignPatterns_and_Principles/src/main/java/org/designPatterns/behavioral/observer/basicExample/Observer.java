package org.designPatterns.behavioral.observer.basicExample;

public interface Observer {

    void update(float temperature, float humidity, float pressure);

    public Observer getInstance();

}
