package org.designPatterns.behavioral.visitor.lambdaExample;

import java.math.BigDecimal;

@FunctionalInterface
public interface ShopingCartVisitor {

    BigDecimal visit(ShopingCartElement element);
}
