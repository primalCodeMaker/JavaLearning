package formating;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Custom {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2018, 10, 28);
        LocalTime time1 = LocalTime.of(1, 55);
        LocalDateTime dateTime = LocalDateTime.of(date1,time1);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, ZoneOffset.ofHours(-4));
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date1, time1, ZoneId.of("Europe/Paris"));
        Instant instant = zonedDateTime.toInstant();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy. HH:mm z");
        System.out.println(formatter.format(zonedDateTime));

        // y - Year (1997 / 97)
        // M - Moth (July, Jul, 07)
        // d - Day (1 - 31)
        // E - Day name in week (Mondey, Sunday)
        // a - Am / Pm maker (AM PM)
        // H - Hour (0 - 23)
        // h - Hour in AM / PM (0 - 13)
        // m - Minutes (0 - 60)
        // s - Seconds (0 - 60)



    }
}
