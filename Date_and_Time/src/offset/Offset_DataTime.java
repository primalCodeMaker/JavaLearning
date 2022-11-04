package offset;

import java.time.*;

public class Offset_DataTime {

    public static void main(String[] args) {
        System.out.println(OffsetDateTime.now(ZoneId.of("UTC")));

        // sposoby inicjalizacji
        System.out.println(OffsetDateTime.of(2022, 10, 27, 12, 1, 3, 1222, ZoneOffset.UTC));

        LocalDate localDate = LocalDate.of(2022, 10, 27);
        LocalTime localTime = LocalTime.of(12, 1, 3);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(2));

        System.out.println(OffsetDateTime.of(localDate, localTime, ZoneOffset.UTC));
        System.out.println(OffsetDateTime.of(localDateTime, ZoneOffset.UTC));

        System.out.println("------- efekt przesuniecia --------");
        System.out.println(OffsetDateTime.of(localDateTime, ZoneOffset.of("+05:00")));
        System.out.println(OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(-2)));

        System.out.println("offsetDateTime: " + offsetDateTime);
    }
}
