package Part2.Project2.lvl1;

import static Part2.Project2.DataFactory.produce;
import static Part2.Project2.Money.Currency.EUR;

public class Exercise4and5 {

    public static void main(String[] args) {

        long exercise4 = produce().stream()
                .map(a -> a.getProduct().getPrice().getCurrency())
                .filter(a -> a.equals(EUR))
               // .peek(a -> System.out.println(a))
                .count();

         System.out.println(exercise4);


        long exercise5 = produce().stream()
                .map(a -> a.getProduct())
                .distinct()
                .map(a -> a.getPrice().getCurrency())
                .filter(a -> a.equals(EUR))
               // .peek(a -> System.out.println(a))
                .count();

        System.out.println(exercise5);

    }
}
