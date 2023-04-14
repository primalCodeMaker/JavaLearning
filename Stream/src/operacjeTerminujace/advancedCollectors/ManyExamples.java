package operacjeTerminujace.advancedCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class ManyExamples {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Warszawa", "Wroclaw", "Gdansk", "Lodz", "Wroclaw", "Gdans", "Lodz");

        // .collect(Collectors.counting())
        long countResult = list.stream()
                .collect(Collectors.counting());
        System.out.println(countResult);


        // .collect(Collectors.joining())
        // Na wyjsciu ma Stringa, a na wejscu CharSequence
        String joining = list.stream()
                .filter(v -> v.length() > 6)
                .collect(Collectors.joining(" - ", "Start,", "end"));
        System.out.println(joining);

        // toCollection
        // mozna stosowac var jako typ zwracamy. Dzieki temu nie musimy na sztywno okreslac co bedzie zwracane
        // nie wiadomo jaka implementacje kolekcji nam zwroci
        var toCollection = list.stream()
                .filter(v -> v.length() > 6)
                .collect(Collectors.toSet());
        System.out.println(toCollection);
        System.out.println(toCollection.getClass());

        // wybieramy dokladna imoplementacje kolekcji jaka chcemy:
        Set<String> toSpecyficCollection = list.stream()
                .filter(v -> v.length() > 6)
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println(toSpecyficCollection.getClass());

        // maxBy / minBy << zwraca minimalna albo maxymalna wartosc podczas porownywania
        // wymaga podania comparatora

        Optional<String> collectMaxBY = list.stream()
                .collect(Collectors.maxBy(Comparator.reverseOrder()));
        System.out.println(collectMaxBY);


        // mapping <<< laczay w jednym kroku map oraz operacje terminujaca
        // IntelliJ podpowiada aby zamieniac to na klasyczny zapis

        // zapis klasyczny :
        Integer classicMap = list.stream()
                .map(String::length)
                .reduce(0, (a, b) -> a + b);

        // to samo, zapis Collectors.mapping
        Integer CollectorsMapping = list.stream()
                .collect(Collectors.mapping(String::length, Collectors.reducing(0, (a, b) -> a + b)));

        System.out.println(classicMap);
        System.out.println(CollectorsMapping);


    }
}

