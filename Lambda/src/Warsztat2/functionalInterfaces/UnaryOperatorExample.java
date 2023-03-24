package Warsztat2.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator1 = str -> str + str;
        System.out.println(unaryOperator1.apply(15));

        UnaryOperator<String> gimmeStringValue = UnaryOperatorExample::gimmeStringValue;

        String beep = gimmeStringValue.apply("beep ");
        System.out.println(beep);

    }

    private static String gimmeStringValue(String s) {
        System.out.println("s + s = " + s + s);
        return s + s;
    }
}
