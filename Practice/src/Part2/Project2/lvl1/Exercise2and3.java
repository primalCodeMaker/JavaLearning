package Part2.Project2.lvl1;

import Part2.Project2.Purchase;

import static Part2.Project2.DataFactory.produce;
import static Part2.Project2.Purchase.Payment.BLIK;


public class Exercise2and3 {

    public static void main(String[] args) {

        long exrcise2 = produce().stream()
                .filter(a -> a.getPayment().equals(BLIK))
                .peek(p -> System.out.println(p))
                .count();

        System.out.println(exrcise2);


        long exrcise3 = produce().stream()
                .filter(a -> a.getPayment().equals(Purchase.Payment.CREDIT_CARD))
                .map(a -> a.getBuyer())
                .distinct()
                .peek(p -> System.out.println(p))
                .count();

        System.out.println(exrcise3);

    }
}
