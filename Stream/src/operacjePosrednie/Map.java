package operacjePosrednie;

import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {

        List<String> list = List.of("Warszawa", "Wroclaw", "Zakopane", "Lodz", "Szczecin", "Gdynia", "Gdansk", "Walbrzych");

        // map - uzywamy jesli chcemy w jakis sposob zminic rodzaj danych na ktorych operujemy
        List<Integer> citysLength = list.stream()
                .map(elem -> elem.length())
                .collect(Collectors.toList());

        System.out.println(citysLength);

        // map2
        List<String> toUpper = list.stream()
                .map(elem -> elem.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(toUpper);

    }
}
