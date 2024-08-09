package org.designPatterns.behavioral.visitor.secondExample;

import java.math.BigDecimal;

public interface ShopingCartElement {

    BigDecimal accept(ShopingCartVisitor visitor);
}
