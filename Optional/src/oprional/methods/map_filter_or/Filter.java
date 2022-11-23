package oprional.methods.map_filter_or;

import java.util.Optional;

public class Filter {
    public static void main(String[] args) {

        Optional<Car> car = Optional.of(new Car(new SteeringWheel(0.5)));
        Optional<Car> car2 = Optional.empty();

        // jesli warunki z filter nei zostana spelnione to zwroc optional.Empty
        Optional<Double> diameter = car
                .map(c -> c.getSteeringWheel())
                .map(sw -> sw.getDiameter())
                .filter(d -> {
                    System.out.println("Filtering d >= 0.5");
                    return d >= 0.5;
                })
                .filter(d -> {
                    System.out.println("Filtering d < 0.7");
                    return d < 0.7;
                });

        System.out.println();
        // jesli srednica nie spelni ktoregokolwiek z warunkow filtrowania to zwroci wartosc Optional.Empty dla zmiennej diameter
        System.out.println("diameter: " + diameter);
        System.out.println("car: " + car);

    }
}
