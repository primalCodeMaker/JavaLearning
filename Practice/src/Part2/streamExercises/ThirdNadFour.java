package Part2.streamExercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdNadFour {

    // 3 -Znajdź drugi najmniejszy element w liście poniżej:
    // 4- 4. Znajdź drugą największą wartość w liście poniżej:
    //List<Integer> numbers = Arrays.asList(1, 5, 16, 18, 2, 5, 2, 6, 2, 1, 6, 1, 23, 64, 34);

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 5, 16, 18, 2, 5, 2, 6, 2, 1, 6, 1, 23, 64, 34);

        Optional<Integer> secondMIN = numbers.stream()
                .sorted(Comparator.naturalOrder())
                .distinct()
                .limit(2)
                .max(Comparator.naturalOrder());

        System.out.println(secondMIN);


        Optional<Integer> secondMAX = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(2)
                .min(Comparator.naturalOrder());

        System.out.println(secondMAX);

    }
}
