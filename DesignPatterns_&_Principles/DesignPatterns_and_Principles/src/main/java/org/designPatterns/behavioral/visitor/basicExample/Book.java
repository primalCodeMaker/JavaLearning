package org.designPatterns.behavioral.visitor.basicExample;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Visitable {

    double price;
    String title;
    String author;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
