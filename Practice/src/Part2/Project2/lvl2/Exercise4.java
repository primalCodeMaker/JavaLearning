package Part2.Project2.lvl2;

import Part2.Project2.Client;
import Part2.Project2.Money;
import Part2.Project2.Purchase;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Part2.Project2.DataFactory.produce;

public class Exercise4 {

    // Oblicz ilu unikalnych klientów kupiło produkt wyceniony w EUR (klienci nie mogą się powtarzać,
    // pamiętaj, że jeden mógł kupić kilka produktów).
    // Dodatkowo stwórz mapę w której kluczem jest id klienta, a wartością lista zakupów produktów tego klienta w EUR.

    public static void main(String[] args) {

        List<Purchase> exercise4 = produce().stream()
                .filter(p -> p.getProduct().getPrice().getCurrency().equals(Money.Currency.EUR))
                .distinct()
                .collect(Collectors.toList());

        Map<String, List<Purchase>> exercise41 = exercise4.stream()
                .collect(Collectors.groupingBy(a -> a.getBuyer().getId()));


        exercise41.forEach((a, b) -> System.out.println(b));
        //System.out.println(exercise4);


    }
}
