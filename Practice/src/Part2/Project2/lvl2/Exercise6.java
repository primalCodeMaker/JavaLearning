package Part2.Project2.lvl2;

import Part2.Project2.Product;
import Part2.Project2.Purchase;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Part2.Project2.DataFactory.produce;

public class Exercise6 {

//    Stwórz mapę, gdzie kluczem będą roczniki,
//    a wartością unikalny zestaw kategorii produktów kupionych przez dany rocznik.

    public static void main(String[] args) {


        Map<String, Set<Product.Category>> collect = produce().stream()
                .collect(Collectors.toMap((Purchase k) -> k.getBuyer().getPesel().toString().substring(0, 2),
                        v -> Set.of(v.getProduct().getCategory()),
                        (merge1, merge2) -> Stream.concat(merge1.stream(), merge2.stream())
                                .collect(Collectors.toSet())
                ));


         collect.forEach((a, b) -> System.out.println("key = " + a + " value =" + b));
    }
}
