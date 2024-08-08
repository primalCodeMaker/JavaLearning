package org.designPatterns.behavioral.observer.basicExample;

import lombok.ToString;

@ToString
public class ObservweImpl implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.printf(
                "Current conditions: %sC degrees, humidity: %s, pressure: %s%n",
                temperature, humidity, pressure
        );
    }

    @Override
    public Observer getInstance() {
        return ObservweImpl.this;
    }
}
