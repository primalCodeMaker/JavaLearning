package duration;

import java.time.*;

public class AdditionToLocal {

    public static void main(String[] args) {

            LocalDate localDate = LocalDate.of(2022, 10, 27);
            LocalTime localTime = LocalTime.of(15, 36, 45);
            LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
            Period period = Period.of(0, 2, 5);
            Duration duration = Duration.ofDays(5);

        System.out.println(localDate.plus(period));         // 2023-01-01
        //System.out.println(localDate.plus(duration)); nie mozna dodac duration do DATY
        //System.out.println(localDate.plus(period)); nie mozna dodac peroid do Czasu
        System.out.println(localTime.plus(duration));       // 15:36:45
        System.out.println(localDateTime.plus(period));     // 2023-01-01T15:36:45
        System.out.println(localDateTime.plus(duration));   // 2022-11-01T15:36:45

        System.out.println(Duration.between(localTime, LocalTime.now()));  //PT-11H-39M-28.1354249S na dzien 12.11.2022 :P
        // w powyzszym przykladzie LocalDateTime tez zadziala
    }
}
