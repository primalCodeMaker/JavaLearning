package Part2.Project2.lvl3;

// Dla ludzi starszych niż 50 lat stwórz strukturę, w której zawrzesz informacje:
// rocznik, najmniej popularna kategoria dla danego rocznika,
// ilość transakcji dla danego rocznika w obrębie danej kategorii.
// Mówiąc najmniej popularna mamy na myśli, najmniejszą ilość dokonanych zakupów w obrębie danej kategorii.
// Np: "rocznik: 62, najmniej popularna kategoria: GARDEN, transakcje: 5"

import Part2.Project2.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Part2.Project2.DataFactory.produce;

public class Exercise1 {

    static Integer currentYear = LocalDate.now().getYear();
//    static final Integer currentYear = 2020;


    public static void main(String[] args) {

        var collect1 = produce().stream()
                .filter(y -> currentYear - (1900 + Integer.parseInt(y.getBuyer().getYearOfBirth())) > 50)
                .collect(Collectors.groupingBy(
                        p -> p.getBuyer().getYearOfBirth(),
                        Collectors.groupingBy(
                                p -> p.getProduct().getCategory(),
                                Collectors.counting()
                        )
                ));

        var collesct2 = collect1.entrySet().stream()
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> Arrays.stream(Product.Category.values())
                                .collect(Collectors.toMap(
                                        categoryKey -> e.getValue().getOrDefault(categoryKey, 0L),
                                        categoryKey -> List.of(categoryKey),
                                        (curentList, nestList) -> Stream.concat(curentList.stream(), nestList.stream())
                                                .collect(Collectors.toList()),
                                        TreeMap::new
                                ))
                ));

        var collesct3 = collesct2.entrySet().stream()
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue().entrySet().stream()
                                .min(Comparator.comparing(
                                        (Map.Entry<Long, List<Product.Category>> entry) -> entry.getKey()
                                ))
                                .get()
                ));


        collesct3.forEach((a, b) -> System.out.println("KEY: " + a + " Val: " + b));

    }
}
