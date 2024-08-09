package org.designPatterns.behavioral.visitor.secondExample;

import java.math.BigDecimal;

public interface ShopingCartVisitor {

    BigDecimal visit(Apple apple);

    BigDecimal visit(Bicycle bicycle);
}
