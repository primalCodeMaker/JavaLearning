package primitiveVariables;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class IntStreamExample {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        // .mapToInt(sth -> sth) przyjmuje cokolwiek i zmienia to do inta
        int sum = list.stream()
                .mapToInt(sth -> sth)
                .sum();
        System.out.println(sum);


        // .average() typ zwracany ma OptionalDouble
        OptionalDouble average = list.stream()
                .mapToInt(sth -> sth)
                .peek(a -> System.out.println(a))
                .average();
        System.out.println(average);

        // aby zamienic stream z numerami na objekt uzywamy metody  .mapToObj(sth -> sth)


        // dzialania na streamie nieskonczonym
        OptionalDouble infinityStream = DoubleStream.generate(() -> Math.random() * 100)
                .peek(a -> System.out.println(a))
                .limit(100)
                .average();
        System.out.println("average: " + infinityStream);

        // zamiana primitive Streama na Streama z typem generycznym np:  Stream<Long>
        Stream<Long> boxed = LongStream.generate(() -> (long) (Math.random() * 100)).limit(10)
                .boxed();
       boxed.forEach(val -> System.out.println(val));

    }
}
