package Part2.Project2.lvl2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static Part2.Project2.DataFactory.produce;

public class Exercise7 {

    // Jaki jest drugi najczęściej kupowany produkt?
    // Jeżeli kilka produktów jest kupionych w takiej samej ilości, posortuj je alfabetycznie po id, i nadal weź drugi.
    // Czyli sortujesz najpierw po największej ilości wystąpień danego produktu, a potem po id.

    public static void main(String[] args) {

        Map<String, Long> esercise7 = produce().stream()
                .collect(Collectors.groupingBy(k -> k.getProduct().getId(),
                        TreeMap::new,
                        Collectors.mapping(
                                v -> v.getQuantity(),
                                Collectors.reducing(0L, Long::sum)
                        )));

        esercise7.forEach((a, b) -> System.out.println("key: " + a + " val: " + b));


        Comparator<? super Exc7supportClass<String, Long>> pairComparator = Comparator.comparing((Exc7supportClass<String, Long> p) -> p.getV())
                .reversed()
                .thenComparing((Exc7supportClass<String, Long> p) -> p.getU());

        Exc7supportClass<String, Long> second_most_popular_product = esercise7.entrySet().stream()
                .map(entry -> new Exc7supportClass<>(entry.getKey(), entry.getValue()))
                .sorted(pairComparator)
                .skip(1)
                .findFirst()
                .orElse(new Exc7supportClass<>("there is no first pair", 0L));

        System.out.println(second_most_popular_product);


    }
}
