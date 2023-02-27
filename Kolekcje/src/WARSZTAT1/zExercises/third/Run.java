package WARSZTAT1.zExercises.third;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Run {

    public static void main(String[] args) {

        Ceo ceo = new Ceo();
        Acountant acountant = new Acountant();

        Deque<Invoice> invoicesStack = new ArrayDeque<>();
        for (int i = 1; i <= 4; i++) {
            invoicesStack.push(new Invoice(i + " " + getNumber() + " ", getRandomPrice()));
        }

        print(invoicesStack);
        ceo.takeAction(invoicesStack);


        acountant.takeAction(invoicesStack);
        acountant.takeAction(invoicesStack);
        acountant.takeAction(invoicesStack);
        print(invoicesStack);

    }

    public static void print(Deque<Invoice> invoicesStack) {
        for (Invoice invoice : invoicesStack) {
            System.out.println(invoice);
        }
        System.out.println("sum = " + getSumm(invoicesStack));
        System.out.println();
    }


    public static BigDecimal getSumm(Deque<Invoice> stack) {
        BigDecimal sum = new BigDecimal(0.0);
        for (Invoice invoice : stack) {
            sum = sum.add(invoice.getAmount());
        }

        return sum;
    }

    public static Invoice createInvoice(Deque stack) {
        int i = stack.size();
        Invoice newInvoice = new Invoice(i + 1 + " " + getNumber() + " ", getRandomPrice());
        return newInvoice;
    }

    public static BigDecimal getRandomPrice() {
        BigDecimal randomDouble = new BigDecimal(Math.random() * 100);
        randomDouble = randomDouble.setScale(3, RoundingMode.CEILING);
        return randomDouble;
    }

    public static String getNumber() {
        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("yyyy");
        String number = LocalDate.now().format(dataFormat);
        return number;
    }
}
