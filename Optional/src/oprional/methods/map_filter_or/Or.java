package oprional.methods.map_filter_or;

import java.util.Optional;

public class Or {
    public static void main(String[] args) {

        Optional<Car> car = Optional.of(new Car(new SteeringWheel(0.8)));
        Optional<Car> car2 = Optional.empty();

        // jesli pierwsza wartosc car bedzie pusta, to zwroc Optional.empty
        // jesli pierwsza wartosc dla car nie bedzie empty, to kod nie bedzie sie dalej wykonywal
        Optional<Car> carOr = car2.or(() -> Optional.empty());
        System.out.println(carOr);

        System.out.println("--------------");

        // zlozony zapis
        Optional<Car> or = car2
                .or(() -> {
                    System.out.println("First");
                    return Optional.empty();
                })
                .or(() -> {
                    System.out.println("Second");
                    return Optional.of(new Car());
                });
        System.out.println(or);

    }
}