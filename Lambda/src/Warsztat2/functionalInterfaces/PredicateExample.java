package Warsztat2.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Szczecin");
        cities.add("Gdynia");
        cities.add("Zakopane");
        cities.add("Szczecin");

        // tutaj wywolujac metode definiujemy co ona ma robic
        print(cities, c -> c.contains("i"));
        System.out.println();

        // zupelnie inne wywolanie predykatu w tej metodzie
        print(cities, c -> (c.length() > 7));
        System.out.println();

        // uzycie mechanizmu method reference
        print(cities, PredicateExample::staticTest);

    }


    // piszemy metode print, ktora wie, ze przyjmuje Predykat, ale warunki tego predykatu napiszemy dopiero
    // przy wywolaniu tej metody
    private static void print(final List<String> list, Predicate<String> checker) {

        for (String city : list) {
            if (checker.test(city)) {
                System.out.println(city);
            } else {
                System.out.println("false");
            }
        }
    }

    private static boolean staticTest(String input) {
        System.out.println("calling method staticTest() " + input);
        return input.contains("i");
    }
}
