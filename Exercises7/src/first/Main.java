package first;

// Napisz klasę Book, która będzie posiadała numer ISBN, tytuł oraz autora.
// Następnie stwórz pare książek, dodaj je do tablicy,
// a następnie stwórz drugą tablicę, która będzie zawierała elementy z tej pierwszej, ale tylko takie, których tytuł zaczyna się na 'H'. Nie pozwól, żeby nowa tablica zawierała null.
// Zobaczysz to jak ją wydrukujesz

import java.util.Arrays;

public class Main extends Book {

    public Main(int isbn, String title, String autor) {
        super(isbn, title, autor);
    }

    public static void main(String[] args) {

        Book[] returnBooks = Book.createArr1();

        System.out.println(Arrays.toString(returnBooks));
        //System.out.println(returnBooks[1].toString());
        System.out.println();

        int index = 0;
        for (Book book : returnBooks) {
            if (book.getTitle().startsWith("H")) {
                index++;
            }
        }

        Book[] titleOnH = new Book[index];

        int i = 0;
        int j = 0;
        for (Book book : returnBooks) {
            if (book.getTitle().startsWith("H")) {
                titleOnH[i] = returnBooks[j];
                j++;
                i++;
                System.out.println(Arrays.toString(titleOnH));
            }


        }

    }
}




