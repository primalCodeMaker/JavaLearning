package operacjePosrednie.distinct;

import operacjePosrednie.mapSecondExample.City;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

    public static void main(String[] args) {

        List<City> list = List.of(
                new City("Warszawa"),
                new City("Wroclaw"),
                new City("Wroclaw"),
                new City("Zakopane"),
                new City("Lodz"),
                new City("Lodz"));

        String collect = list.stream()
                .distinct()
                .map(City::getName)
                .collect(Collectors.joining(", "));
        System.out.println(collect);

        // przy obiektach trzeba nadpisac equals oraz hashcode aby moc porownywac obiekty i usowac duplikaty
        // w tym przypadu operacja distinct() nie robi nic i obiekty z mojej listy drukuje ponownie

    }
}
