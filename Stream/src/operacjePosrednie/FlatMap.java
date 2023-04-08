package operacjePosrednie;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Warszawa", "Gdansk", "Lodz", "Wroclaw", "Gdans", "Lodz");
        List<String> list2 = Arrays.asList("Bialystok", "Szczecin", "Lodz", "Zakopane", "Gdans", "Lodz");
        List<String> list3 = Arrays.asList("Warszawa", "Lublin", "Wroclaw", "Wroclaw", "Krakow", "Poznan");

        // flatMap
        List<List<String>> listCombines = List.of(list1, list2, list3);
        System.out.println(listCombines);

        // z takiego zapisu mamy streama na Liscie Stringow.
        Stream<List<String>> stream = listCombines.stream();

        // aby pozbyc sie tego trzeba uzyc flatMap aby odpakowac te stringi
        // zmieniamy tez nasza referencje bezposrednio na String

        Set<String> stringStream = listCombines.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toSet());

        System.out.println(stringStream);
        System.out.println(stringStream.getClass());

    }
}
