package WARSZTAT1.zExercises;

import java.util.List;

public class PersonOne {

    Car garbus = new Car("VW", "Garbus", 1984);
    Car ogorek = new Car("VW", "Ogorek", 1962);
    Car porshe = new Car("Porshe", "911", 1975);

    List<Car> carsPersonOne = List.of(garbus, ogorek, porshe);

    public List<Car> getCarsPersonOne() {
        return carsPersonOne;
    }

    public Car getGarbus() {
        return garbus;
    }
}
