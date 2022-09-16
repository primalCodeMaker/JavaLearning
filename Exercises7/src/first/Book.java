package first;

import java.util.Arrays;

public class Book {

    private int ISBN;
    private String Autor;
    private String title;

    public Book() {
    }

    public Book(int isbn, String title, String autor) {
        this.ISBN = isbn;
        this.Autor = autor;
        this.title = title;
    }

    public static Book[] createArr1() {
        Book[] books = new Book[]{
                new Book(111, "History of Poland", "PWN"),
                new Book(222, "Harry Potter", "J.K. Rowling"),
                new Book(333, "Ogniem i Mieczem", "Henryk Sienkiewicz"),
                new Book(444, "The Lord of the Rings", "J. R. R. Tolkien"),
                new Book(555, "Hobbit", "J. R. R. Tolkien")
        };

        //System.out.println(Arrays.toString(books));
        return books;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("ISBN=").append(ISBN);
        sb.append(", Autor='").append(Autor).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

