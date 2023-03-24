package Warsztat2.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String[] args) {

        BiConsumer<String, Cat> biConsumer = BiConsumerExample2::printing;

        biConsumer.accept("Hello world ", new Cat());

    }

    private static void printing(String str1, Cat cat1) {
        System.out.println("Cat " + cat1 + " string " + str1);
    }

    static class Cat {
        @Override
        public String toString() {
            return "Cat{}";
        }
    }
}
