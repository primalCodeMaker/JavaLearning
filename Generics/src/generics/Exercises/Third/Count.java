package generics.Exercises.Third;


// Napisz metodę generyczną, która zliczy ilość elementów w kolekcji,
// które mają w sobie coś charakterystycznego, np. liczby są nieparzyste
// Wykorzystaj predykat.

import java.util.ArrayList;
import java.util.List;

public class Count {


    public static void main(String[] args) {

        List<Number> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println(countOddNumbers(list));
        // to mi wywala błąd bo na etapie runtimu wszystko rzutuje na Longa a liste mam z intami

    }

    public static <Y> int countOddNumbers(List<Y> list) {
        int counter = 0;
        for (Y element : list) {
            if ((Long) element % 2 != 0) {
                counter++;

            }

        }
        return counter;

    }
}
