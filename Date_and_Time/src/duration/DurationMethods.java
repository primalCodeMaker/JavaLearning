package duration;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationMethods {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2022, 10, 27);
        LocalTime localTime = LocalTime.of(15, 36, 45);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        Duration duration = Duration.between(localDateTime,LocalDateTime.now());

        System.out.println(duration.getUnits());
        System.out.println(duration.getSeconds());
        System.out.println(duration.get(ChronoUnit.SECONDS));
       // System.out.println(duration.get(ChronoUnit.DAYS)); minuty, dni i powyzej nie sa obslugiwane

        System.out.println(duration.isZero());

        System.out.println(duration);                                   // PT373H9M38.2298397S
        System.out.println(duration.truncatedTo(ChronoUnit.MINUTES));   // PT373H9M
        System.out.println(duration.truncatedTo(ChronoUnit.SECONDS));   // PT373H9M38S
        System.out.println(duration.truncatedTo(ChronoUnit.HOURS));     // PT373H
    }
}
