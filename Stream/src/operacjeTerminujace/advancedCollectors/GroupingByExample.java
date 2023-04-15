package operacjeTerminujace.advancedCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Warszawa", "Wroclaw", "Gdansk", "Lodz", "Wroclaw", "Zakopane");

        // podobnie jak partitioningBy zwraca Mape
        // ale na podstawie klucza jaki sobie wymyslimy
        Map<Integer, List<String>> groupingBy1 = list.stream()
                .collect(Collectors.groupingBy(String::length));

        groupingBy1.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value + " ::: " + value.getClass()));
        System.out.println();


        // tutaj okreslamy w jakiej kolekcje chcemy miec wartosci
        Map<Integer, Set<String>> groupingBy2 = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toCollection(TreeSet::new)));

        groupingBy2.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value + " ::: " + value.getClass()));
        System.out.println("jaka implementacja mapy?: " + groupingBy2.getClass());
        System.out.println();


        // jesli chcemy scisle ustalic jaka ma byc implementacja mapy np. TreeMap
        Map<Integer, TreeSet<String>> groupingBy3 = list.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toCollection(TreeSet::new)));

        System.out.println("jaka implementacja mapy?: " + groupingBy3.getClass());
    }
}
