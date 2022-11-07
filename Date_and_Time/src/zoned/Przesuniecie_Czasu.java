package zoned;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Przesuniecie_Czasu {

    public static void main(String[] args) {

        ZoneId zone = ZoneId.of("Europe/Paris");

        LocalDate date1 = LocalDate.of(2018, 10, 28);
        LocalTime time1 = LocalTime.of(1, 55);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date1, time1, zone);

        System.out.println("Step1: " + zonedDateTime);  // UTC +2
        zonedDateTime = zonedDateTime.plusHours(1);
        System.out.println("Step2: " + zonedDateTime);  // UTC +2
        zonedDateTime = zonedDateTime.plusHours(1);
        System.out.println("Step3: " + zonedDateTime); // tutaj nastepuje zmiana UTC na +1




    }
}
