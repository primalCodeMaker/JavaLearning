package zoned;

import java.time.*;
import java.time.ZonedDateTime;

public class Examples {
    public static void main(String[] args) {
        ZoneOffset utc = ZoneOffset.UTC;
        ZoneId usPacific = ZoneId.of("US/Pacific");
        ZoneId paris = ZoneId.of("Europe/Paris");

        LocalDate localDate = LocalDate.of(2022, 10, 27);
        LocalTime localTime = LocalTime.of(12, 1, 3);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println(ZonedDateTime.of(localDate, localTime, utc));
        System.out.println(ZonedDateTime.of(localDateTime, utc));

        System.out.println(ZonedDateTime.of(localDateTime, usPacific));
        System.out.println(ZonedDateTime.of(localDateTime, paris));

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, paris);

        System.out.println(zonedDateTime.getDayOfMonth());
        zonedDateTime.withHour(2);


    }
}
