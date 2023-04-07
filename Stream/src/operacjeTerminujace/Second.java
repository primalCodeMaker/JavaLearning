package operacjeTerminujace;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Second {

    public static void main(String[] args) {

        List<String> list = List.of("v1", "v2", "v3");
        String[] charList = new String[]{
                "a", "z", " ", "c", "d", "e", "l",
                "g", "h", "j", "k",
                "x", "b", "x", "m", "z"};

        // reduce - skleja wszystkie elementy w streamie do jednej wartosci wynikowej. Moze to byc string albo np: Lista
        Optional<String> reduce = Stream.of(charList)
                .reduce((a, b) -> a + b);
        System.out.println(reduce);

        // collect - laczy elementy streama w jakas kolekcje. Nie mamy gwarancji jaka to bedzie kolekcja
        List<String> collect = Stream.of(charList)
                .collect(Collectors.toList());
        System.out.println(collect);

        //jesli chcemy wymusic jaka to ma byc kolekcja np: treeSet to uzywamy metody toCollection(Supplier ()->kolekcja)
        Set<String> collectTreeSet = Stream.of(charList)
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println(collectTreeSet.getClass());

        // kolektor joining laczy wartosci do streinga. Mozna mu podac wartosc jaka beda oddzielone elementy
        String collectorJoining = Stream.of(charList)
                        .collect(Collectors.joining("_"));
        System.out.println(collectorJoining.getClass());
        System.out.println(collectorJoining);
    }
}
