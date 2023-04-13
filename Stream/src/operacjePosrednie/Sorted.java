package operacjePosrednie;

import java.util.List;

public class Sorted {

    public static void main(String[] args) {

        List<String> cities1 = List.of("Warszawa", "Wroclaw", "Zakopane", "Lodz", "Szczecin", "Wroclaw", "Lodz");

        cities1.stream()
                .peek(elem -> System.out.println("Step1: " + elem))
                .sorted()
                .forEach(elem -> System.out.println("Step2: " + elem));

        // sorted nalezy dawac po limicie w streamach nieskonczonych
        // bo kompilator bedzie caly czas segregowal nowe pozycje i nigdy nie dojdzie do kolejnej linijki kodu

        // aby sortowac obiekty to musza miec one w klasie nadpisany hashcode i equals
        // albo w sorted((e1, e2) -> e1.compareTo(e2)) napisac comparator
    }
}
