package org.designPatterns.behavioral.visitor.basicExample;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DVD implements Visitable {

    double price;
    String title;
    String director;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
