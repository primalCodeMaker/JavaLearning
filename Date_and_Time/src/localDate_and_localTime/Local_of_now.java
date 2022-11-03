package localDate_and_localTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Local_of_now {

    public static void main(String[] args) {
        System.out.println("LocalDate.now " + LocalDate.now());
        System.out.println("LocalTime.now " + LocalTime.now());
        System.out.println("LocalDateTime.now " + LocalDateTime.now());
        System.out.println();

        System.out.println("LocalDate.of " + LocalDate.of(2020, 11, 2));
        System.out.println("LocalDate.of " + LocalDate.of(2020, Month.OCTOBER, 2));
        System.out.println("LocalTime.of " + LocalTime.of(17, 50));
        System.out.println("LocalTime.of " + LocalTime.of(17, 50, 20));
        System.out.println("LocalTime.of " + LocalTime.of(17, 50, 20, 902));
        System.out.println();
        System.out.println("LocalDateTime.of " + LocalDateTime.of(
                LocalDate.of(2020, 11, 2),
                LocalTime.of(17, 50))
        );
    }
}
