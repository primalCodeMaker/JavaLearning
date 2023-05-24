package Part2.Project2.lvl2;

import java.util.stream.Collectors;

import static Part2.Project2.DataFactory.produce;

public class Exercise7 {

    // Jaki jest drugi najczęściej kupowany produkt?
    // Jeżeli kilka produktów jest kupionych w takiej samej ilości, posortuj je alfabetycznie po id, i nadal weź drugi.
    // Czyli sortujesz najpierw po największej ilości wystąpień danego produktu, a potem po id.

    public static void main(String[] args) {

        produce().stream()
                .map(product -> product.getProduct().getName())
                .sorted(String::compareTo)
                .peek(s -> System.out.println(s))
                .collect(Collectors.toList());
    }
}
