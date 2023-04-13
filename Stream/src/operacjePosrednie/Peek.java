package operacjePosrednie;

import operacjePosrednie.mapSecondExample.City;
import operacjePosrednie.mapSecondExample.Person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Peek {

    public static void main(String[] args) {

        List<Person> list = List.of(
                new Person("Angelika", new City("Warszawa")),
                new Person("Ewa", new City("Wroclaw")),
                new Person("Magda", new City("Zakopane")),
                new Person("Monika", new City("Lodz")));

        Set<String> collect = list.stream()
                .peek(elem -> System.out.println(elem + " HI!"))
                .map(Person::getCity)
                .peek(c -> System.out.println("list+map+getCity: " + c))
                .map(city -> city.getName())
                .peek(n -> System.out.println(n))
                .collect(Collectors.toSet());
        System.out.println(collect);

    }
}
