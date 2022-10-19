package sets.Objects;

import java.util.HashSet;
import java.util.Set;

public class Run {
    public static void main(String[] args) {

        CarFactory car1 = new CarFactory("VW", "Garbus", 1984);
        CarFactory car2 = new CarFactory("VW", "Garbus", 1984);
        CarFactory car3 = new CarFactory("VW", "Garbus", 1984);

        Set<CarFactory> carFactorySet = new HashSet<>();
        carFactorySet.add(car1);
        carFactorySet.add(car2);
        carFactorySet.add(car3);

        System.out.println(carFactorySet);
    }
}
