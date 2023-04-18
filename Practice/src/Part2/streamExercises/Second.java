package Part2.streamExercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Second {

    // Wykorzystując Streamy, na podanej tablicy liter wykonaj następujące operacje (w podanej
    //kolejności):
    //◦ zamień wszystkie litery na wielką literę,
    //◦ pozbądź się litery 'X',
    //◦ posortuj malejąco,
    //◦ zwróć wynik jako jeden String.
    //String[] letters = {"z", "x", "a", "j", "a", "v", "x", "k", "a", "x"};

    public static void main(String[] args) {

        String[] letters = {"z", "x", "a", "j", "a", "v", "x", "k", "a", "x"};

        Optional<String> streamExample = Arrays.stream(letters).toList().stream()
                .map((a) -> a.toUpperCase())
                .filter(x -> !x.contains("X"))
                .sorted(Comparator.reverseOrder())
                .reduce((a, b) -> a + b);

        System.out.println(streamExample);


    }
}
