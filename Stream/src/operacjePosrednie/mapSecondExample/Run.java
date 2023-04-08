package operacjePosrednie.mapSecondExample;

import java.util.List;

public class Run {

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

        // stream1
        String operation1 = list.stream()
                .map(person -> person + "A")
                .map(person -> person.toUpperCase())
                .reduce("START: ", String::concat);
        System.out.println(operation1);

        // stream2
        String operation2 = list.stream()
                .map(Person::getCity)
                .map(city -> city.getName())
                .map(String::toUpperCase)
                .reduce("START2: ", (a, b) -> String.format("%s-%s", a, b));
        System.out.println(operation2);

    }
}
