package operacjePosrednie;

import java.util.List;

public class Limit {

    public static void main(String[] args) {

        List<String> cities1 = List.of("Warszawa", "Wroclaw", "Zakopane", "Lodz", "Szczecin", "Wroclaw", "Lodz");

        // limit pozwla ustalic dla ilu elementow naszej kolekcji mamy wykonac streama.
        // po osiagnieciu limitu stream zakancza sie
        // nie ma znaczenia w ktorym miejscu go damy. Mozna na poczatku streama, w srodku albo na koncu

        cities1.stream()
                .peek(elem -> System.out.println("Step1: " + elem))
                .map(elem -> elem.length())
                .peek(elem -> System.out.println("Step2: " + elem))
                .peek(elem -> System.out.println("Step3: " + elem))
                .limit(4)
                .forEach(elem -> System.out.println("Step4: " + elem));

    }
}
