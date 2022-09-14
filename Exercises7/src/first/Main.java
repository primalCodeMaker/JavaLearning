package first;

// Napisz klasę Book, która będzie posiadała numer ISBN, tytuł oraz autora.
// Następnie stwórz pare książek, dodaj je do tablicy,
// a następnie stwórz drugą tablicę, która będzie zawierała elementy z tej pierwszej, ale tylko takie, których tytuł zaczyna się na 'H'. Nie pozwól, żeby nowa tablica zawierała null.
//Zobaczysz to jak ją wydrukujesz

public class Main extends Book {


    public Main(int isbn, String title, String autor) {
        super(isbn, title, autor);
    }


        public void run() {
        Book[] books = new Book[] {
                new Book (111, "History of Poland", "PWN" ),
                new Book (222, "Harry Potter", "J.K. Rowling"),
                new Book(333, "Ogniem i Mieczem", "Henryk Sienkiewicz"),
                new Book (444, "The Lord of the Rings", "J. R. R. Tolkien"),
                new Book(555, "Hobbit", "J. R. R. Tolkien")
        };


        }




}
