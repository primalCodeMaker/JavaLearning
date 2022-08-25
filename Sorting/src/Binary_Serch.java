import java.util.Arrays;

public class Binary_Serch {



    public static void main(String[] args) {
        int [] array = {4, 6, 1, 2, 5, 2, 9, 6, 12, 52, 1, 4};
        System.out.println("Before: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After: " + Arrays.toString(array));

        // metoda szuka w tablicy intow podanej przez nas wartosci
        // i zwraca miejsce w pamieci
        // tablica musi byc posortowana do wywolania metody binarySerch
        // jesli metoda zawiera kilka elementow o wartosci ktora szukamy, to nie ma pewnosci ktora wartosc zostanie zwrocona
        // jesli w tablicy szukamy lcizby ktorej nie ma, to mtoda zwroci -(miejsce w ktorym powinno sie to znajdowac) -1

        int result = Arrays.binarySearch(array, 5);
        System.out.println(result);


    }
}
