package Warsztat2.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {

        // tutaj jako dzialanie funkcji uzywamy metody
        // mechanizm method reference
        Consumer<String> consumer1 = ConsumerExample2::body;

        // dopiero w tym miejscu nasza funkcja zostanie uruchomiona
        consumer1.accept("Napis");

    }

    private static void body(String argument) {
        System.out.println("callin accept");
        System.out.println(argument);
    }
}
