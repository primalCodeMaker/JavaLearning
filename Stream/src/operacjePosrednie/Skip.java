package operacjePosrednie;

import java.util.List;

public class Skip {

    public static void main(String[] args) {

        List<String> cities1 = List.of("Warszawa", "Wroclaw", "Zakopane", "Lodz", "Szczecin", "Wroclaw", "Lodz");

        cities1.stream()
                .peek(elem -> System.out.println("Step1: " + elem))
                .skip(3)
                .map(elem -> elem.length())
                .peek(elem -> System.out.println("Step2: " + elem))
                .peek(elem -> System.out.println("Step3: " + elem))
                .forEach(elem -> System.out.println("Step4: " + elem));

        // jesli ustawimy skipa(n:3) za krokiem 1 to dla kazdego elementu wywola sie krok1
        // a dla trzech pierwszych reszta krokow nie wykona sie

        // jesli ustawimy skipa(n:4) za krokiem 2 to dla kazdego elementu wywolaja sie ktok1 i krok2
        // a dla czterech pierwszych kolejne kroki juz nie wykonaja sie

    }
}
