package Basics;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowDoesItWork {

    public static void main(String[] args) {

        // definiujemy Streama
        Stream<String> empty = Stream.empty();
        Stream<String> stringStream = Stream.of("5", "65", "10")

                //definiujemy krok posredni
                // metoda peak() pozwala podejrzec wsystkie elementy dodane do Streama
                .peek(element -> System.out.println("element: " + element));

// dodajemy tutaj metode terminujaca. Bez niej Stream nigdy nie zostanie uruchomiony
        stringStream.collect(Collectors.toList());


    }
}
