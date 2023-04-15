package operacjeTerminujace.advancedCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByExample3 {

    public static void main(String[] args) {

        // nieokreslona generycznie kolekcje dzielimy sobie na osobne mapy
        // gdzie kluczem jest klasa reprezentujaca nowa wartosc

        List list = Arrays.asList("Patrycja", 1, 4, 2.2, "Angela", 3.5, new Cat());

        Map<?, ArrayList<?>> collectingdDifferentTypes = (Map<?, ArrayList<?>>) list.stream()
                .collect(Collectors.groupingBy(
                        elem -> elem.getClass(),
                        Collectors.toList()
                ));
        collectingdDifferentTypes.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

    }

    private static class Cat {
        @Override
        public String toString() {
            return "Cat{}";
        }
    }
}
