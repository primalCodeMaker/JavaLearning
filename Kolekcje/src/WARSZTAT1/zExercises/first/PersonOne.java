package WARSZTAT1.zExercises.first;

import java.util.List;

public class PersonOne {

    Car garbus = new Car("VW", "Garbus", 1984);
    Car ogorek = new Car("VW", "Ogorek", 1962);
    Car porshe = new Car("Porshe", "911", 1975);

    public List listPersoneOne() {
        return List.of(garbus, ogorek, porshe);
    }

}
