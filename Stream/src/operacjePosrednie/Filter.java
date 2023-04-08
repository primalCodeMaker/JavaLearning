package operacjePosrednie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {

        List<String> list = List.of("Warszawa", "Wroclaw", "Zakopane", "Lodz", "Szczecin", "Gdynia", "Gdansk", "Walbrzych");

        //filter zapis1
        Stream<String> myStream1 = list.stream();
        Stream<String> filteringResult = myStream1
                .filter(elem -> elem.contains("a"))
                .filter(elem -> elem.contains("o") || elem.contains("e"));
        List<String> filteredList = filteringResult.toList();

        System.out.println(filteredList);

        //filter zapis2 czesciej spotykany
        List<String> filteredList2 = list.stream()
                .filter(elem -> elem.contains("a"))
                .filter(elem -> elem.contains("o") || elem.contains("e"))
                .collect(Collectors.toList());

        System.out.println(filteredList2);


    }
}
