package Part2.Project2.lvl3;

// Który rocznik kupił najwięcej produktów?


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Part2.Project2.DataFactory.produce;

public class Exercise2 {

    public static void main(String[] args) {

        var QuantityByYear = produce().stream()
                .collect(Collectors.groupingBy(
                        p -> p.getBuyer().getYearOfBirth(),
                        Collectors.mapping(
                                p -> p.getQuantity(),
                                Collectors.reducing(0L, Long::sum)
                        )
                ));

        var YearByQuantity = QuantityByYear.entrySet().stream()
                .collect(Collectors.toMap(
                        e -> e.getValue(),
                        e -> Set.of(e.getKey()),
                        (currentList, nextValue) -> Stream.concat(currentList.stream(), nextValue.stream())
                                .collect(Collectors.toSet()),
                        TreeMap::new
                ));
       var mostPopularProducts = YearByQuantity.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getKey))
                .orElseThrow(() -> new RuntimeException("no pucharse"));

        YearByQuantity.forEach((a, b) -> System.out.println("KEY: " + a + " Val: " + b));
        System.out.println();

        System.out.printf("Most number of products (%s) was bought by people  from years %s ",
                mostPopularProducts.getKey(),
                mostPopularProducts.getValue()
                );

    }
}
