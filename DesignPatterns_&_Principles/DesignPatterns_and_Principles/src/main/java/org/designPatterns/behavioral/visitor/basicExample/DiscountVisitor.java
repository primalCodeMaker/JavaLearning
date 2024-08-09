package org.designPatterns.behavioral.visitor.basicExample;

public class DiscountVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        book.setPrice(book.getPrice() * 0.9);
        System.out.println("Discounted book price: " + book.getPrice());

    }
    @Override
    public void visit(DVD dvd) {
        dvd.setPrice(dvd.getPrice() * 0.8);
        System.out.println("Discounted DVD price: " + dvd.getPrice());
    }

}
