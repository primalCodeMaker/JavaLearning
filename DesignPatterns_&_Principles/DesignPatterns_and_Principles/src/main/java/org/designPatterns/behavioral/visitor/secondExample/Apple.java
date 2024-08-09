package org.designPatterns.behavioral.visitor.secondExample;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Apple implements ShopingCartElement {

    private BigDecimal pricePerKg;

    private BigDecimal weight;


    @Override
    public BigDecimal accept(ShopingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
