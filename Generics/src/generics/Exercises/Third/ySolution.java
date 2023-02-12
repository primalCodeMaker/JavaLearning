package generics.Exercises.Third;

// Napisz metodę generyczną, która zliczy ilość elementów w kolekcji,
// które mają w sobie coś charakterystycznego, np. liczby są nieparzyste
// Wykorzystaj predykat.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ySolution {

    public static void main(String[] args) {

        List<Long> longList = new ArrayList<>();
        for (long i = 0; i < 15; i++) {
            longList.add(i);
        }

        List<Integer> intList2 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            intList2.add(i);
        }

        System.out.println(longList);
        System.out.println(intList2);

        System.out.println(countOddNumbers(longList, c -> c % 2 != 0));
        System.out.println(countOddNumbers(intList2, c -> c % 2 != 0));
    }

    public static <T> int countOddNumbers(List<T> list, Predicate<T> predicate) {
        int counter = 0;
        for (T element : list) {
            if (predicate.test(element)) {
                counter++;
            }
        }
        return counter;

    }
}
