package Part2.streamExercises;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class First {

    // Napisz funkcyjną implementację silni, czyli taką, która wykorzystuje Stream.

    public static void main(String[] args) {

        long now = System.currentTimeMillis();

        List<Integer> list = Stream.iterate(1, (a) -> a + 1)
                .limit(10).toList();

        //stream1.forEach(a -> System.out.println("number: " + a + " milis: " + ((System.currentTimeMillis()) - now)));

     //   BinaryOperator silnia = ((a,b) -> a*b);


    }
}
