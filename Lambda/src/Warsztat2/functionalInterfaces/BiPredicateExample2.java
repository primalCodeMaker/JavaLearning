package Warsztat2.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample2 {

    public static void main(String[] args) {
        BiPredicate<String, Dog> biPredicate = BiPredicateExample2::myChecker;

        boolean dogResult = biPredicate.test("Dog", new Dog());
        System.out.println(dogResult);


    }

    private static Boolean myChecker(String s, Dog d) {
        System.out.println("biPredicate method says Hello :) ");
        return d.toString().contains(s);
    }

    static class Dog {
    }
}