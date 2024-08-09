package org.designPatterns.behavioral.visitor.lambdaExample;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Apple implements ShopingCartElement {

    private BigDecimal pricePerKg;

    private BigDecimal weight;

}
