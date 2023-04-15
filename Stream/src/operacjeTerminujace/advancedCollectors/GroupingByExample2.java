package operacjeTerminujace.advancedCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByExample2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Warszawa", "Wroclaw", "Gdansk", "Lodz", "Wroclaw", "Zakopane");


        Map<Integer, String> groupingBy4 = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.joining("_")));

        groupingBy4.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("jaka implementacja mapy?: " + groupingBy4.getClass());
        System.out.println();


        Map<Integer, Long> groupingBy5 = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        groupingBy5.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println("jaka implementacja mapy?: " + groupingBy5.getClass());
    }
}
