package org.designPatterns.behavioral.visitor.secondExample;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ShopingCartElement> elements =  List.of(
                new Bicycle(BigDecimal.valueOf(100.1), BigDecimal.TEN),
                new Bicycle(BigDecimal.valueOf(200.2), BigDecimal.TEN),
                new Apple(BigDecimal.valueOf(15),BigDecimal.valueOf(1.5)),
                new Apple(BigDecimal.valueOf(30),BigDecimal.valueOf(3.15))
        );

        ShopingCartVisitor shopingCartVisitor = new ShopingCartVisitorImpl();

        BigDecimal result = elements.stream()
                .map(element -> element.accept(shopingCartVisitor))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total Price: " + result);


    }
}