package Part2.Project2.lvl2;

import Part2.Project2.Purchase;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

import static Part2.Project2.DataFactory.produce;

public class Exercise5 {

    // Przygotuj mapę, gdzie kluczem będzie rocznik klienta, a wartościami, lista wszystkich produktów jakie klient z danego rocznika kupił.
    // Rocznik weź z numeru PESEL, nie musi być to pełne 1987, może
    // być przykładowo 87. Posortuj mapę po kluczu rosnąco.

    public static void main(String[] args) {

        Map<String, String> collect = produce().stream()

                .collect(Collectors.groupingBy(v -> v.getBuyer().getPesel().toString().substring(0, 2),
                        TreeMap::new,
                        Collectors.mapping(
                                val -> val.getProduct().getName(), Collectors.reducing(" ", (a, b) -> a + " " + b))
                ));


        collect.forEach((a, b) -> System.out.println("key = " + a + " value =" + b));


    }
}
