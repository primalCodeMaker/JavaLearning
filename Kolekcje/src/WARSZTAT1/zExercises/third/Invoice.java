package WARSZTAT1.zExercises.third;

import java.math.BigDecimal;
import java.util.Objects;

public class Invoice {

    private String id;
    private BigDecimal amount;

    public Invoice(String id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invoice invoice)) return false;
        return Objects.equals(id, invoice.id) && Objects.equals(amount, invoice.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount);
    }
}
