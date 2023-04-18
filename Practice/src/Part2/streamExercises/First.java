package Part2.streamExercises;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class First {

    // Napisz funkcyjną implementację silni, czyli taką, która wykorzystuje Stream.

    public static void main(String[] args) {

        List<Integer> list = Stream.iterate(1, (a) -> a + 1)
                .limit(5).toList();

        Optional<Integer> reduceSilnia = list.stream()
                .reduce((a, b) -> a * b);
        System.out.println(reduceSilnia);

    }
}
