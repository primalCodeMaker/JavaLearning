package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Equals {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(12.0000);
        BigDecimal bd2 = new BigDecimal("12.0000");

        BigDecimal bd3 = BigDecimal.valueOf(12.0000);
//        BigDecimal bd4 = BigDecimal.valueOf("12.0000");  << tak sie nie da

        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd3);
        System.out.println("----------------");

        System.out.println("bd1.equals(bd2): " + bd1.equals(bd2));
        System.out.println("bd1.equals(bd3): " + bd1.equals(bd3));
        System.out.println("bd2.equals(bd3): " + bd2.equals(bd3));


        System.out.println("----------------");
        // podczas tworzenia BigDecmala mozna dodac metode setScate z parametrem RoundingMode.XXX
        // wtedy ustalimy ile zer chcemy miec i jak ma to sie zaokraglac
        BigDecimal bd4 = BigDecimal.valueOf(12.0000).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bd5 = new BigDecimal(12.000).setScale(2,RoundingMode.HALF_UP);
        BigDecimal bd6 = new BigDecimal("12.000").setScale(2,RoundingMode.HALF_UP);

        System.out.println("bd4.equals(bd5): " + bd4.equals(bd5));
        System.out.println("bd4.equals(bd6): " + bd4.equals(bd6));
        System.out.println("bd5.equals(bd6): " + bd5.equals(bd6));

    }
}
