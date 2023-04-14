package operacjeTerminujace.advancedCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class toMapExamples {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Warszawa", "Wroclaw", "Gdansk", "Lodz", "Wroclaw", "Gdans", "Zakopane");

        // toMap - przerabia zbior na mape, ma 3 przeladowania
            // nie obsluguje duplikatow - wywala exception, bo nie mozna zrobic klucza z taka sama wartoscia

//        Map<String, Integer> collectMap = list.stream()
//                .collect(Collectors.toMap(key -> key, String::length));
//        collectMap.forEach((k, v) -> System.out.println("Key " + k + " Value " + v));

        System.out.println("-------------- obsluga duplikatow -------------");

        // po zdefiniowaniu klucza i wartosci, definiujemy dodatkowo merge function, która w przypadku duplikatu klucza
        // laczy rozne wartosci do jednego stringa.
        Map<Integer, String> collectMap2 = list.stream()
                .collect(Collectors.toMap(String::length, v -> v, (left, right) -> left + " and " + right));
        collectMap2.forEach((k, v) -> System.out.println("Key " + k + " Value " + v));

        System.out.println("--------- metoda z lista jako wartosc kluczy MAPy ---------");


        // mozemy tez jako wartosc dla klucza przyjac liste,
        // i bedziemy dodawac elementy zduplikowanych kluczy jako osobne objekty w liscie
        // w takim podejsciu nie ma gwarancji zwracanego typu kolekcji

        Map<Integer, List<String>> collectMap3 = list.stream()
                .collect(Collectors.toMap(String::length, value -> List.of(value), (left, right) -> merge(left, right)));
        collectMap3.forEach((k, v) -> System.out.println("Key " + k + " Value " + v));
        System.out.println("collectMap3.getClass = " + collectMap3.getClass());

        System.out.println();

        // tutaj definiujemy dokladnie jaka implementacje mapy chcemy uzyskac (TreeMap)
        // i zamieniamy na ladny kod z urzyciem method reference
        Map<Integer, List<String>> collectMap4 = list.stream()
                .collect(Collectors.toMap(String::length, List::of, toMapExamples::merge, TreeMap::new));
        collectMap4.forEach((k, v) -> System.out.println("Key " + k + " Value " + v));
        System.out.println("collectMap4.getClass = " + collectMap4.getClass());

    }

    private static List<String> merge(List<String> left, List<String> right) {
        List<String> result = new ArrayList<>(left);
        result.addAll(right);
        return result;
    }
}
