package org.designPatterns.behavioral.visitor.secondExample;

import java.math.BigDecimal;

public class ShopingCartVisitorImpl implements ShopingCartVisitor{

    @Override
    public BigDecimal visit(Apple apple) {
        BigDecimal result = apple.getWeight().multiply(apple.getPricePerKg());
        System.out.println("Apple price: " + result);
        return result;
    }

    @Override
    public BigDecimal visit(Bicycle bicycle) {
        BigDecimal result = bicycle.getPrice().subtract(bicycle.getDiscount());
        System.out.println("Bicycle price: " + result);
        return result;
    }
}
