package generics.Exercises.Fourth;

// Napisz metodę generyczną, która w podanej tablicy będzie w stanie zamienić ze sobą elementy
// na dwóch podanych pozycjach.

import java.util.Arrays;

public class Fourth {

    public static void main(String[] args) {

        Byte[] arr = new Byte[]{0, 1, 2, 3, 4};
        Fourth obj = new Fourth();

        System.out.println(Arrays.toString(arr));

        obj.swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));


    }

    <T> void swap(T[] array, int element1, int element2) {
        int el1 = element1;
        int el2 = element2;
        T temp;
        temp = array[el2];

        array[el2] = array[el1];
        array[el1] = temp;

    }

}
