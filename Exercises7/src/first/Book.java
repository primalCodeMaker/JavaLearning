package first;

public class Book {

    private int ISBN;
    private String Autor;
    private String title;

    public Book (int isbn, String title, String autor) {
        this.ISBN = isbn;
        this.Autor = autor;
        this.title = title;



        for (int i = 0; i < 10; i++) {
            Book[] book = new Book[i];
            System.out.println(book);

        }


    }


}
