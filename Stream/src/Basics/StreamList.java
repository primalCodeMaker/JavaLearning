package Basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {

    public static void main(String[] args) {

        List<String> listString = List.of("5", "65", "10", "55", "5", "100");

        Stream<String> stream1 = listString.stream()
                .peek(elem -> System.out.println("elem: " + elem));

        Stream<String> stream2 = listString.stream()
                .peek(elem -> System.out.println("elem: " + elem));

        stream1.collect(Collectors.toList());

        // streamy mozna chainowac i bezposrednio na wyniku Streama zrobic kolejny Stream
        // ale unika sie takich zapisow. Nieczytelny kod
        stream2.collect(Collectors.toList()).stream().collect(Collectors.toList()).stream().collect(Collectors.toList());

//      stream1.collect(Collectors.toList()); <<< nie mozna odpalic tego 2gi raz bo krzyczy wyjatkiem

    }
}
