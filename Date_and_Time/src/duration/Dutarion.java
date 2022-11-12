package duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Dutarion {

    public static void main(String[] args) {

        System.out.println(Duration.ofDays(2));         // PT48H  (PT = Peroid of Time)
        System.out.println(Duration.ofHours(11));       // PT11H
        System.out.println(Duration.ofMinutes(65));     // PT1H5M
        System.out.println(Duration.ofSeconds(59));     // PT59S
        System.out.println(Duration.ofMillis(1000));    // PT1S
        System.out.println(Duration.ofNanos(111));      // PT0.000000111S
        //chainowanie metod nie dziala

        System.out.println();
        System.out.println("==== wywolanie generyczne ====");
        System.out.println(Duration.of(1, ChronoUnit.DAYS));
        System.out.println(Duration.of(1, ChronoUnit.HOURS));
        System.out.println(Duration.of(1, ChronoUnit.HALF_DAYS));

    }
}
