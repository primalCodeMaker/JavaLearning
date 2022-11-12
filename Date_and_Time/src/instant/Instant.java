package instant;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Instant {

    public static void main(String[] args) {

        ZoneId zoned1 = ZoneId.of("US/Pacific");
        ZoneId zoned2 = ZoneId.of("Europe/Paris");

        LocalDate date = LocalDate.of(2022, 10, 27);
        LocalTime time = LocalTime.of(12, 1, 3);

        System.out.println(java.time.Instant.ofEpochSecond(5400065445L));
        System.out.println(java.time.Instant.now());

        System.out.println("==== Zoned ====");

        System.out.println(ZonedDateTime.of(date, time, zoned1));               // zwraca czas UTC + strefe czasowa danego obszaru
        System.out.println(ZonedDateTime.of(date, time, zoned1).toInstant());   // przy metodzie toInstatnt zwraca czas lokalny a nie UTC
        System.out.println(ZonedDateTime.of(date, time, zoned2));
        System.out.println(ZonedDateTime.of(date, time, zoned2).toInstant());

    }
}
