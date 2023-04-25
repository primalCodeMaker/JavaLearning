package Part2.Project2;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal value;
    private final Currency currency;

    // konstruktory, gettery itp


    public Money(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;


    }

    @Override
    public String toString() {
        return "Money{" +
                "value=" + value +
                ", currency=" + currency +
                '}';
    }

    public enum Currency {
        PLN,
        EUR
    }
}
