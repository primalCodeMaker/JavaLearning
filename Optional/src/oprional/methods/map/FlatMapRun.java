package oprional.methods.map;

import java.util.Optional;

// FlatMap stosujemy gdy watrosc, ktora zwraca metoda jest opakowana w Optionala
public class FlatMapRun {

    public static void main(String[] args) {

        Optional<Car> car = Optional.of(new Car());
        Optional<Car> car1 = Optional.of(new Car(new SteeringWheel(0.6)));
        Optional<Car> car3 = Optional.empty();

        // Optional w Optionalu (nieczytelny zapis)
        Optional<Optional<SteeringWheel>> steeringWheel = car1.map(c -> c.getSteeringWheelOpt());

        // zapis bez zagniezdzenia optionala, tez nie czytelny
        Optional<SteeringWheel> steeringWheel2 = car1.map(c -> c.getSteeringWheelOpt()).map(value -> value.get());

        // faltMap() jesli zwracana wartosc jest opakowana w Optionala to zostanie to automatycznie rozpakowane
        // dzieki czemu zapis sie skroci
        Optional<SteeringWheel> steeringWheel3 = car1.flatMap(c -> c.getSteeringWheelOpt());

        // tutaj schodzimy glebiej i chcemy wyciagnac srednice, ktora tez jest Optionalem:
        Optional<Double> steeringWheelDiameter = car1
                .flatMap(c -> c.getSteeringWheelOpt())
                .flatMap(sw -> sw.getDiameterOpt());
        System.out.println(steeringWheelDiameter);

        Double daimeter = car1
                .flatMap(c -> c.getSteeringWheelOpt())
                .flatMap(sw -> sw.getDiameterOpt())
                .orElse(0.0); // w przypadku gdy chcemy wyciagnac wartosc nie opakowana w optionala, musimy dodac na koncu ta metode
        System.out.println(daimeter);

    }
}
