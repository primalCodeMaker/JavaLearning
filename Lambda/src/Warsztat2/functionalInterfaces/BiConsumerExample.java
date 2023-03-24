package Warsztat2.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, Cat> biConsumer = (str1, cat1) -> {
            System.out.println("Cat " + cat1 + " string " + str1);
        };
        biConsumer.accept("Hello world ", new Cat());

    }

    static class Cat {
        @Override
        public String toString() {
            return "Cat{}";
        }
    }
}
