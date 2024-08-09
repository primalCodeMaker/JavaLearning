package org.designPatterns.behavioral.visitor.basicExample;

public class Main {

    public static void main(String[] args) {
        Book book = new Book(30.0, "The Lord of the Rings", "J.R.R. Tolkien");
        DVD dvd = new DVD(20.0, "Shrek", "Andrew Adamson");

        Visitor visitor = new DiscountVisitor();

        book.accept(visitor);
        dvd.accept(visitor);

    }
}
