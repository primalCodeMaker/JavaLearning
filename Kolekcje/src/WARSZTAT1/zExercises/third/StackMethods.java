package WARSZTAT1.zExercises.third;

import java.math.BigDecimal;
import java.util.Deque;

public class StackMethods {

    public static void print(Deque<Invoice> invoicesStack) {
        if (invoicesStack.size() == 0) {
            System.out.println("the stack is empty");
            System.out.println("sum = " + getSumm(invoicesStack));
            System.out.println();
        } else {
            System.out.println();
            for (Invoice invoice : invoicesStack) {
                System.out.println(invoice);
            }
            System.out.println("sum = " + getSumm(invoicesStack));
            System.out.println();
        }
    }

    public static BigDecimal getSumm(Deque<Invoice> stack) {
        BigDecimal sum = new BigDecimal(0.0);
        for (Invoice invoice : stack) {
            sum = sum.add(invoice.getAmount());
        }

        return sum;
    }
}
