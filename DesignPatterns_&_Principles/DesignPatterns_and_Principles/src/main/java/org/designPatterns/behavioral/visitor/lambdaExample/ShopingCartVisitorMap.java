package org.designPatterns.behavioral.visitor.lambdaExample;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

public class ShopingCartVisitorMap implements Function<Class<? extends ShopingCartElement>, ShopingCartVisitor> {

    private static final Map<Class<? extends ShopingCartElement>, ? extends ShopingCartVisitor> VISITORS = Map.of(
            Apple.class, element -> visit((Apple) element),
            Bicycle.class, element -> visit((Bicycle) element)
    );

    private static BigDecimal visit(final Apple apple) {
        BigDecimal result = apple.getWeight().multiply(apple.getPricePerKg());
        System.out.println("Apple price: " + result);
        return result;
    }

    private static BigDecimal visit(final Bicycle bicycle) {
        BigDecimal result = bicycle.getPrice().subtract(bicycle.getDiscount());
        System.out.println("Apple price: " + result);
        return result;
    }

    @Override
    public ShopingCartVisitor apply(Class<? extends ShopingCartElement> aClass) {
        return VISITORS.get(aClass);

    }
}
