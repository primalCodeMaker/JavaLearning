package Warsztat2.methodReference.constructors;

import java.util.Optional;

public class Start {

    public static void main(String[] args) {

        Start start = new Start();
        start.run();

    }

    private void run() {
        SteeringWheel steeringWheel = new SteeringWheel(45.22);

        Car car = Optional.of(steeringWheel)
//                .map(sw -> new Car(sw))
                .map(Car::new)
                .orElse(new Car(new SteeringWheel(0.0)));

        System.out.println(car);

    }
}


