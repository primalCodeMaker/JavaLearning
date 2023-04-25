package Part2.Project2.lvl1;

import Part2.Project2.DataFactory;

import java.util.Comparator;

public class Exercise1 extends DataFactory {

    public static void main(String[] args) {

        long exercise1 = produce().stream()
                .map(a -> a.getBuyer())
                .distinct()
                .sorted(Comparator.naturalOrder())
                .peek(a -> System.out.println(a))
                .count();

        System.out.println(exercise1);

    }
}
