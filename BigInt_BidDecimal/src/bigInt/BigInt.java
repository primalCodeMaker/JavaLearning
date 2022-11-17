package bigInt;

import java.math.BigInteger;

public class BigInt {

    public static void main(String[] args) {

        BigInteger bigIntegerZero = BigInteger.ZERO;
        BigInteger bigIntegerOne = BigInteger.ONE;
        BigInteger bigIntegerTwo = BigInteger.TWO;
        BigInteger bigIntegerTen = BigInteger.TEN;

        BigInteger bigInteger1 = BigInteger.valueOf(564654654564546L);
        BigInteger bigInteger2 = new BigInteger("785648953148623165843213215816965");

        BigInteger plus = bigInteger1.add(bigInteger2);
        System.out.println(plus);
        System.out.println(bigInteger2.intValue());




    }
}
