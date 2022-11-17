package bigInt;

import java.math.BigInteger;

public class Compare {

    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("51561564564548864654");
        BigInteger bi2 = new BigInteger("515615645645481864654");

        // metoda porownanai zaproponowana przez Jave
        if (bi1.compareTo(bi2) > 0) ;

        System.out.println(greateerThan(bi2, bi1));
    }

    // lepiej zrobic wlasna metode:
    // w przypadku first == second zwroci false
    private static boolean greateerThan(BigInteger first, BigInteger second) {
        return first.compareTo(second) > 0;
    }
}
