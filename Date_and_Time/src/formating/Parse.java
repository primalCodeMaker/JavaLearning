package formating;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Parse {

    public static void main(String[] args) {
        LocalDate date2 = LocalDate.parse("2022-03-26");
        LocalDateTime dateTime2 = LocalDateTime.parse("2018-10-28T01:55:00");

        System.out.println(date2);
        System.out.println(dateTime2);

        // wlasnie formatowanie:
        String stringDate = "Mon, 05 May 1980";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
        LocalDate parsed = LocalDate.parse(stringDate, formatter);
        System.out.println("parsed date from string: " + parsed);
    }
}
