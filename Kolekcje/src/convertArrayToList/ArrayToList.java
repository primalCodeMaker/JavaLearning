package convertArrayToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        Integer[] array = {1, 4, 5, 6};
        List<Integer> list = Arrays.asList(array);

        // list.add(9); <<< nie mozna dodac bo nie wiadomo jaki to rodzaj listy
        // Arrays.asList nie ma dostepnej metody add

        // po przypisaniu wartosci do nowej tablicy mozna juz dodarac do niej elementy
        Integer[] array2 = {1, 4, 5, 6};
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array));
        list2.add(9);
        System.out.println(list2);

        // konvertowanie Listy do Tablicy:
        Integer[] objects = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(objects));
    }

}
