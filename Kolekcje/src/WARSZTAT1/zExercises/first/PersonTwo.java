package WARSZTAT1.zExercises.first;

import java.util.Arrays;
import java.util.List;

public class PersonTwo {

        Car skylark = new Car("Buick", "Skylark", 1972);
        Car chrysler = new Car("Chrysler", "Le Baron", 1959);
        Car eldorado = new Car("Cadillac", "Devile", 1966);
        Car porshe = new Car("Porshe", "911", 1975);


    public List makeCarsPersonTwo() {
       return Arrays.asList(this.skylark, this.chrysler, this.eldorado, this.porshe);
    }

    public Car getSkylark() {
        return skylark;
    }

    public Car getChrysler() {
        return chrysler;
    }

    public Car getEldorado() {
        return eldorado;
    }

    public Car getPorshe() {
        return porshe;
    }
}
