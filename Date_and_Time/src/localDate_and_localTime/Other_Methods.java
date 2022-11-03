package localDate_and_localTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;

public class Other_Methods {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Month.values()));

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MIDNIGHT);

        System.out.println("------");
        System.out.println(LocalDate.MIN); // minimalna data -999999999-01-01
        System.out.println(LocalDate.MAX); // maxymalna data +999999999-12-31

        System.out.println("------");
        System.out.println(LocalTime.ofSecondOfDay(86399));

        LocalTime localTime = LocalTime.of(15,00,00);
        System.out.println(localTime.toSecondOfDay()); // ilosc sekund jaka minela od poczatku dnia

        System.out.println("-------");
        System.out.println(localTime.withHour(5).withMinute(15)); // with calkowicie zmienia date/czas na zdeklarowany przez nas w zmiennej

    }

}
