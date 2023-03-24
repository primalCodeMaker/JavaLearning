package Warsztat2.functionalInterfaces;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<Car, String> carToString = c -> c.toString();

        // metoda map przyjmuje jako argument interfejs funkcyjny Function
        Optional<String> carOpt = Optional.of(new Car())
                .map(carToString);

        System.out.println(carToString.apply(new Car()));


// --------------------------------------------------------------------------
        System.out.println("Example 2: ");
        // w lambdzie zamieniamy Car na Train
        Function<Car, Train> carToTrain = c -> {
            return new Train();
        };

        Car vw = new Car();
        System.out.println(carToTrain.apply(vw));


    }

    private static class Car {
        private String model = "WV";

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }

    private static class Train {
        private String voice = "ciuuciuuuh";

        @Override
        public String toString() {
            return "Train{" +
                    "voice='" + voice + '\'' +
                    '}';
        }
    }
}
