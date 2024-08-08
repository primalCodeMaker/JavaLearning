package org.designPatterns.behavioral.observer.basicExample;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation(new ArrayList<>());

        Observer observer1 = new ObservweImpl();

        Display display = new Display();
        weatherStation.registerObserver(display);
        weatherStation.registerObserver(observer1);

        weatherStation.setMeasurements(24, 65, 30.4f);
        weatherStation.removeObserver(display);
        weatherStation.setMeasurements(-2, 90, 29.2f);

    }
}
