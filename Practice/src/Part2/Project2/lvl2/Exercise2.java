package Part2.Project2.lvl2;

import Part2.Project2.Product;
import Part2.Project2.Purchase;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Part2.Project2.DataFactory.produce;

public class Exercise2 {

    //        Przygotuj metodę, która przyjmie konkretną kategorię i dla tej kategorii zwróci mapę,
//        gdzie kluczem będzie id klienta,
//        a wartością ilość kupionych przez niego produktów z podanej kategorii
//        (weź pod uwagę tylko te transakcje, w których ilość kupionych produktów jest większa niż 1).


    public static void main(String[] args) {

        System.out.println(getCategoryStatus(produce(), Product.Category.HOBBY));


    }

    private static Map<String, Long> getCategoryStatus(List<Purchase> purchaseList, Product.Category category) {

        Map<String, Long> collectResult = purchaseList.stream()
                .filter(p -> p.getQuantity() > 1)
                .filter(p2 -> p2.getProduct().getCategory().equals(category))
                .collect(Collectors.groupingBy(
                        p -> p.getBuyer().getId(),
                        Collectors.mapping(
                                Purchase::getQuantity,
                                Collectors.reducing(0L, Long::sum)
                        )
                ));

        return collectResult;
    }
}
