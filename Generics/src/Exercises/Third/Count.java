package Exercises.Third;


// Napisz metodę generyczną, która zliczy ilość elementów w kolekcji,
// które mają w sobie coś charakterystycznego, np. liczby są nieparzyste, podane wyrazy są palindromami.
// Wykorzystaj predykat.

import java.util.ArrayList;
import java.util.List;

public class Count {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }


        System.out.println(list);

        //Predicate<T> count = (c) -> c%2 == 0;
    }

    public <Y> void countOddNumbers(List<Y> list) {
        int counter = 0;
        for (Y element : list) {
            if ((Integer) element % 2 != 0) {
                counter++;

            }
        }
     //   return counter;
    }

}
