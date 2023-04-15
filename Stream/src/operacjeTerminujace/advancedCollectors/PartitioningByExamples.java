package operacjeTerminujace.advancedCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class PartitioningByExamples {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Warszawa", "Wroclaw", "Gdansk", "Lodz", "Wroclaw", "Gdans", "Zakopane");

        Map<Boolean, List<String>> partitionBy = list.stream()
                .collect(Collectors.partitioningBy(city -> city.length() > 5));

        partitionBy.forEach((k, v) -> System.out.println("Key " + k + " Value " + v));
        System.out.println("partitionBy.getClass = " + partitionBy.getClass());


        System.out.println();


        // w taki sposob mozemy wymusic aby dla klucza True i False wartosci były w konkretnej kolekcji jaką chcemy
        // np treeSet
        Map<Boolean, Set<String>> partitionBy2parameters = list.stream()
                .collect(Collectors.partitioningBy(city -> city.length() > 5, Collectors.toCollection(TreeSet::new)));

        partitionBy2parameters.forEach((key, value) -> {
            System.out.println("Key: " + key + " Value: " + value);
            System.out.println(value.getClass());
        });
    }


}

