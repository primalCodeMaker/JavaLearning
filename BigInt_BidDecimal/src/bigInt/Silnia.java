package bigInt;

import java.math.BigInteger;

public class Silnia {

    public static void main(String[] args) {
        System.out.println("10!: " + silnia(10));
        System.out.println("11!: " + silnia(11));
        System.out.println("12!: " + silnia(12));
        System.out.println("13!: " + silnia(13));
        System.out.println("14!: " + silnia(14));
        System.out.println("15!: " + silnia(15));
        System.out.println("16!: " + silnia(16));
        System.out.println("17!: " + silnia(17)); //przy tej wartosci silnia dla zwyklego inta zapetla sie
        System.out.println("18!: " + silnia(18));
        System.out.println("19!: " + silnia(19));
        System.out.println("20!: " + silnia(20));
    }

    private static BigInteger silnia(final int n) {
        BigInteger f = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
