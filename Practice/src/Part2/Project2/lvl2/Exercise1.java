package Part2.Project2.lvl2;

import Part2.Project2.Money;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

import static Part2.Project2.DataFactory.produce;
import static java.util.stream.Collectors.reducing;

public class Exercise1 {


    //Oblicz ile PLN wydała w sklepie każda z osób, które dokonały u nas zakupu.
    // Uwzględnij tylko zakupy dokonane w PLN.

    public static void main(String[] args) {


        Map<String, BigDecimal> exercise1 = produce().stream()
                .filter(a -> a.getProduct().getPrice().getCurrency().equals(Money.Currency.PLN))
                .collect(Collectors.groupingBy(k -> k.getBuyer().getId(),
                        Collectors.mapping(
                                val -> val.getProduct().getPrice().getValue().multiply(BigDecimal.valueOf(val.getQuantity())),
                                reducing(BigDecimal.ZERO, ((currentSum, nextValue) -> currentSum.add(nextValue))))));

        exercise1.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
