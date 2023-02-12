package WARSZTAT1.set;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class BadEquals {

    public static void main(String[] args) {
        Set<Dog> dogs = new HashSet<>();
        LocalTime before = LocalTime.now();

        for (int i = 0; i < 100000; i++) {
            dogs.add(new Dog("Dogy" + i / 12));
        }
        System.out.println("Time in milisec: " + Duration.between(before, LocalTime.now()).toMillis());
            // jak w klasie Dog mamy zle nadpisany Equals()
            // to czas sie zwieksza o ponad 4 sec w tym przykladzie
    }
}
