package effectivelyFinal;

import operacjePosrednie.mapSecondExample.City;
import operacjePosrednie.mapSecondExample.Person;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Bypass {

    public static void main(String[] args) {

        List<Person> list = List.of(
                new Person("Angelika", new City("Warszawa")),
                new Person("Ewa", new City("Wroclaw")),
                new Person("Magda", new City("Zakopane")),
                new Person("Monika", new City("Lodz")),
                new Person("Paulina", new City("Szczecin")),
                new Person("Kasia", new City("Gdynia")),
                new Person("Basia", new City("Gdansk")),
                new Person("Monika", new City("Walbrzych"))
        );

        // jesli chcemy zrobic zmienna przed streamem a potem ja inkrementowac bezposrednio w stremie to nie mozna
        // tego zrobic poniewaz nie bedzie effectively Final.
        // aby to obejsc mozna opakowac takiego inta w klase AtomicInteger i wykonywac na niej operacje za pomoca metod
            // dostepnych dla tej klasy
        // Jesli uzywamy metody to nie zmieniamy Referencji, wiec spelniamy zalozenia slowka "final"

        AtomicInteger counter = new AtomicInteger(3);

        String operation2 = list.stream()
                .map(Person::getCity)
                .map(city -> city.getName() + counter.incrementAndGet())
                .map(String::toUpperCase)
                .reduce("START2: ", (a, b) -> String.format("%s-%s", a, b));
        System.out.println(operation2);
        System.out.println(counter);


    }
}
