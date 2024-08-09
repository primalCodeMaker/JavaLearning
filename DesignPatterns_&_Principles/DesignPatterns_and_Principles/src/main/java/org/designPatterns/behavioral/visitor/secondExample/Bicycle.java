package org.designPatterns.behavioral.visitor.secondExample;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Bicycle implements ShopingCartElement {

    private BigDecimal price;

    private BigDecimal discount;


    @Override
    public BigDecimal accept(ShopingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
