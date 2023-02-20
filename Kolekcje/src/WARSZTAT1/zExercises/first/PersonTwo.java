package WARSZTAT1.zExercises.first;

import java.util.Arrays;
import java.util.List;

public class PersonTwo {

        Car skylark;
        Car chrysler;
        Car eldorado;
        Car porshe;
        Car ogorek;


    public PersonTwo() {
//        List list = List.of(
                skylark = new Car("Buick", "Skylark", 1972);
                chrysler = new Car("Chrysler", "Le Baron", 1959);
                eldorado = new Car("Cadillac", "Devile", 1966);
                porshe = new Car("Porshe", "911", 1975);
                ogorek = new Car("VW", "Ogorek", 1962);
//        );
    }

    public List makeCarsPersonTwo() {
       return Arrays.asList(this.skylark, this.chrysler, this.eldorado, this.porshe, this.ogorek);
    }


    @Override
    public String toString() {
        return "PersonTwo{" +
                "skylark=" + skylark +
                ", chrysler=" + chrysler +
                ", eldorado=" + eldorado +
                ", porshe=" + porshe +
                '}';
    }
}
