package WARSZTAT1.zExercises.third;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Deque;
import java.util.Objects;

public class Invoice {

    private String id;
    private BigDecimal amount;

    public Invoice(String id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public static Invoice createInvoice(Deque stack) {
        int i = stack.size();
        Invoice newInvoice = new Invoice(i + 1 + "/" + getNumber(), getRandomPrice());
        return newInvoice;
    }

    public static String getNumber() {
        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("yyyy");
        String number = LocalDate.now().format(dataFormat);
        return number;
    }

    public static BigDecimal getRandomPrice() {
        BigDecimal randomDouble = new BigDecimal(Math.random() * 100);
        randomDouble = randomDouble.setScale(3, RoundingMode.CEILING);
        return randomDouble;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice {"
                + id +
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
