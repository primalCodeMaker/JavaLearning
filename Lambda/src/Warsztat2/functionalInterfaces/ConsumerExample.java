package Warsztat2.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // implementujemy dzialanie metody za pomoca lambdy
        // sama deklaracja nic nie robi.
        Consumer<String> consumer1 = argument -> {
            System.out.println("callin accept");
            System.out.println(argument);
        };

        //wywolujemy metode accept
        // dopiero w tym miejscu nasza funkcja zostanie uruchomiona
        consumer1.accept("Napis");

    }
}
