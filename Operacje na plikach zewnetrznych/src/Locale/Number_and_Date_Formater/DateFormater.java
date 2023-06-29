package Locale.Number_and_Date_Formater;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormater {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2010, 8, 2);
        LocalTime localTime = LocalTime.of(12, 52, 10);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        // standardowe formatowanie zgodnie z ISO
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println();

        // standardowe formatowanie daty czasu, offsertu i zoned
        DateTimeFormatter dateTmeFormatterFULL = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter dateTmeFormatterLONG = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter dateTmeFormatterMEDIUM = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter dateTmeFormatterSHORT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println("FULL: " + localDate.format(dateTmeFormatterFULL));
        System.out.println("LONG: " + localDate.format(dateTmeFormatterLONG));
        System.out.println("MEDIUM: " + localDate.format(dateTmeFormatterMEDIUM));
        System.out.println("SHORT: " + localDate.format(dateTmeFormatterSHORT));
        System.out.println();

        // formatowanie w zaleznosci od podanego locale
        DateTimeFormatter dateTmeFormatterFULL_us = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US);
        DateTimeFormatter dateTmeFormatterLONG_us = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US);
        DateTimeFormatter dateTmeFormatterMEDIUM_us = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.US);
        DateTimeFormatter dateTmeFormatterSHORT_us = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.US);

        DateTimeFormatter dateTmeFormatterFULL_de = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY);
        DateTimeFormatter dateTmeFormatterLONG_de = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.GERMANY);
        DateTimeFormatter dateTmeFormatterMEDIUM_de = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMANY);
        DateTimeFormatter dateTmeFormatterSHORT_de = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.GERMANY);

        System.out.println("FULL US: " + localDateTime.format(dateTmeFormatterFULL_us));
        System.out.println("FULL DE: " + localDateTime.format(dateTmeFormatterFULL_de));
        System.out.println("LONG US: " + localDateTime.format(dateTmeFormatterLONG_us));
        System.out.println("LONG DE: " + localDateTime.format(dateTmeFormatterLONG_de));
        System.out.println("MEDIUM US: " + localDateTime.format(dateTmeFormatterMEDIUM_us));
        System.out.println("MEDIUM DE: " + localDateTime.format(dateTmeFormatterMEDIUM_de));
        System.out.println("SHORT US: " + localDateTime.format(dateTmeFormatterSHORT_us));
        System.out.println("SHORT DE: " + localDateTime.format(dateTmeFormatterSHORT_de));
    }

}
