package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigDecimal {

    public static void main(String[] args) {

        System.out.println(BigDecimal.valueOf(564564.548546854654894564685648));
        System.out.println(BigDecimal.valueOf(Double.MAX_VALUE));

        BigDecimal bd1 = new BigDecimal(Double.MAX_VALUE);
        BigDecimal bd2 = new BigDecimal("455645646.56489546");
        BigDecimal bd3 = new BigDecimal("2.2");

        System.out.println(bd2.divide(bd3, RoundingMode.HALF_UP).setScale(8));

        System.out.println("pow " + bd3.pow(4));
        System.out.println(bd3.doubleValue());

    }
}
