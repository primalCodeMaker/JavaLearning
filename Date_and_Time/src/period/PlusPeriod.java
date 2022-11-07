package period;

import java.time.*;
import java.time.Period;

public class PlusPeriod {

    public static void main(String[] args) {

        LocalDate localDate3 = LocalDate.of(2022,10,27);
        LocalTime localTime = LocalTime.of(22,22);
        LocalDateTime localDateTime = LocalDateTime.of(localDate3, localTime);

        System.out.println(localDate3.plus(Period.of(2,12,0)));
        System.out.println("dla czasu nie mozna zrobic period plus/minus bo klasa period odnosi sie wylacznie do dat");

        System.out.println("localDateTime dziala: " + localDateTime.plus(Period.of(0,0,365)));

        System.out.println("Offset: " + OffsetDateTime.now().plus(Period.of(3,10,88)));
        System.out.println("Zoned: " + ZonedDateTime.now().plus(Period.of(2,1,66)));
    }
}
