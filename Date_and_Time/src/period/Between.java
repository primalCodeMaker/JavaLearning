package period;

import java.time.LocalDate;
import java.time.Period;

public class Between {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2022,10,27);
        LocalDate localDate2 = LocalDate.of(2022,10,28);

        System.out.println(Period.between(localDate1, localDate2));
        System.out.println(Period.between(localDate1, localDate1));
        System.out.println(Period.between(localDate2, localDate1));
    }
}
