package operacjeTerminujace;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("v1", "v2", "v3");

        // count - zlciza ilosc elementow, ktora wystepuje w streamie
        System.out.println(list.stream()
                //operacje posrednie
                .count());

        // findFirst / findAny
        Optional<String> firstResult = list.stream().findFirst();
        System.out.println(firstResult);

        Optional<String> emptyResult = Stream.<String>empty().findAny();
        System.out.println(emptyResult);

        // min / max -> wymaga podania comparatora
        Optional<String> minMax = list.stream().min((a, b) -> b.compareTo(a));
        System.out.println(minMax);

        // allMatch / anyMath / noneMAtch

        // allMatch - czy wszystkie elementy zawieraja, Jesli jakikolwiek z elementow sie nie zgadza zwraca false
        // anyMatch - jesli jakikolwiek element zawiera nasza wartosc to zwraca true
        // noneMatch - jesli zaden z elementow nie zawiera naszej wartosci zwraca true
        boolean v = list.stream()
                .allMatch(a -> a.contains("v"));
        System.out.println(v);

        //forEach - wykonaj jakas akcje dla kazdego elementu. Mozna przypisac do nowej listy i zmienic elementy
            // przy operacjach wielowatkowych elementy moga nam sie pobierac w streamie niezgodnie z kolejnoscia
        List<String> newList = new ArrayList<>();
        list.stream().forEach(elem -> {
            newList.add(elem + " new");
        });
        System.out.println(list);
        System.out.println(newList);


    }
}
