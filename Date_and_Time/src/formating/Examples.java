package formating;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Examples {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2018, 10, 28);
        LocalTime time1 = LocalTime.of(1, 55);
        LocalDateTime dateTime = LocalDateTime.of(date1,time1);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, ZoneOffset.ofHours(-4));
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date1, time1, ZoneId.of("Europe/Paris"));
        Instant instant = zonedDateTime.toInstant();

        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(date1));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(time1));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dateTime));
        System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(offsetDateTime));

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(offsetDateTime));
       System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(date1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dateTime));

        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime));

    }
}
