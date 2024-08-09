package org.designPatterns.behavioral.visitor.lambdaExample;

import java.math.BigDecimal;

public interface ShopingCartElement {

    default BigDecimal accept(ShopingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
