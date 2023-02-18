package WARSZTAT1.zExercises;

import java.util.Arrays;
import java.util.List;

public class PersonTwo {


    Car skylark = new Car("Buick", "Skylark", 1972);
    Car chrysler = new Car("Chrysler", "Le Baron", 1959);
    Car eldorado = new Car("Cadillac", "Devile", 1966);
    Car porshe = new Car("Porshe", "911", 1975);

    List<Car> carsPersonTwo = Arrays.asList(skylark, chrysler, eldorado, porshe);

    public List<Car> getCarsPersonTwo() {
        return carsPersonTwo;
    }
}


