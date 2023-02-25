package WARSZTAT1.zExercises.third;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Run {

    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("#.000");
        Ceo ceo = new Ceo();
        Acountant acountant = new Acountant();

        Deque<Invoice> invoicesStack = new ArrayDeque<>();

        for (int i = 1; i <= 5 ; i++) {
            invoicesStack.push(new Invoice(i + " " + getNumber() + " ", getRandomPrice()));
        }

        for (Invoice invoice : invoicesStack) {
            System.out.println(invoice);
        }





    }



    private static BigDecimal getRandomPrice() {
        BigDecimal randomDouble = new BigDecimal(Math.random()*100);
        randomDouble = randomDouble.setScale(3, RoundingMode.CEILING);
        return randomDouble;
    }

    private static String getNumber() {
        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("yyyy");
        String number = LocalDate.now().format(dataFormat);
        return number;
    }
}
