package org.designPatterns.behavioral.visitor.basicExample;

public interface Visitor {

    void visit(Book book);

    void visit(DVD dvd);
}
