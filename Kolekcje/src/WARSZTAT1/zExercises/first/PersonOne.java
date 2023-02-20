package WARSZTAT1.zExercises.first;

import java.util.List;

public class PersonOne {

    Car garbus = new Car("VW", "Garbus", 1984);
    Car ogorek = new Car("VW", "Ogorek", 1962);
    Car porshe = new Car("Porshe", "911", 1975);


    public List list(List<Car> list1) {
        list1.add(garbus);
        list1.add(ogorek);
        list1.add(porshe);
        return list1;
    }

    List<Car> carsPersonOne = List.of(garbus, ogorek, porshe);


    public Car getGarbus() {
        return garbus;
    }

    public Car getOgorek() {
        return ogorek;
    }

    public Car getPorshe() {
        return porshe;
    }
}
