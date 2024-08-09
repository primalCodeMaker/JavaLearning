package org.designPatterns.behavioral.visitor.lambdaExample;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Bicycle implements ShopingCartElement {

    private BigDecimal price;

    private BigDecimal discount;

}
