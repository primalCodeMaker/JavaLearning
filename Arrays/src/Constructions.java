import java.util.Arrays;

public class Constructions {

    public static void main(String[] args) {

        int[] array1; // zalecany sposob deklarowania tablic
        int array2[]; // niezalecany sposob

        int[] array3 = new int [10];
        // int - typ danych
        // [] - informacja ze jest to tablica
        // aray3 - nazwa zmiennej
        // new int - tworzy tablice, ktora jest tylu int
        // [10] - tozmiar tablicy w ktorej jest 10 elementow


        int[] array4 = new int [] {1, 2, 13, 27};
        int[] array5 = {1, 2, 3, 4};

        // pierwszy element tablicy ma indeks 0
        // ostatni element tablicy ma indeks [rozmiar tablicy] - 1

        System.out.println(array4); // to drukuje wynik funcji hash-code
        System.out.println(Arrays.toString(array4));  // to zwraca wartosc tablicy
        System.out.println(array4[0]);
        System.out.println(array4[1]);
        System.out.println(array4[2]);
        System.out.println(array4[3]);
        System.out.println("============");
        array4[1] = 15668; //zmiana wartosci w indeksie 2 tablicy (bo jest liczone od 0)
        System.out.println(array4[1]);
        System.out.println(Arrays.toString(array4));

    }
}
