package Part2.Project2.lvl2;

import Part2.Project2.Money;

import java.security.cert.PolicyNode;
import java.util.stream.Collectors;

import static Part2.Project2.DataFactory.produce;

public class Exercise1 {


    //Oblicz ile PLN wydała w sklepie każda z osób, które dokonały u nas zakupu.
    // Uwzględnij tylko zakupy dokonane w PLN.

    public static void main(String[] args) {


        long exercise1 = produce().stream()
                .filter(a -> a.getProduct().getPrice().getCurrency().equals(Money.Currency.PLN))
                .map(a -> a.getPayment()
                .peek(a -> System.out.println(a))
                .count();

        System.out.println(exercise1);


    }
}
