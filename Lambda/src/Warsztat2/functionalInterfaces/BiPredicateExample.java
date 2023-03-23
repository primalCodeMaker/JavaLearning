package Warsztat2.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        BiPredicate<String, Dog> biPredicate = (str1, d1) -> {
            System.out.println("biPredicate says Hello :) ");
            return d1.toString().contains(str1);
        };

        boolean dogResult = biPredicate.test("Dog", new Dog());
        System.out.println(dogResult);


    }
    static class Dog {

    }
}
