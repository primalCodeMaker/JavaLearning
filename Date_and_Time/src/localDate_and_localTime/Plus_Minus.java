package localDate_and_localTime;

import java.time.LocalDate;

public class Plus_Minus {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020,10,27);
        System.out.println("My LocalDate " + localDate);
        System.out.println("plusDays " + localDate.plusDays(1));
        System.out.println("plusWeeks " + localDate.plusWeeks(2));
        System.out.println("plusMonths " + localDate.plusMonths(3));
        System.out.println("plusYears " + localDate.plusYears(4));

        System.out.println("-------" + localDate + "-------");
        System.out.println("minusDays " + localDate.minusDays(1));
        System.out.println("minusWeeks " + localDate.minusWeeks(2));
        System.out.println("minusMonths " + localDate.minusMonths(3));
        System.out.println("minusYears " + localDate.minusYears(4));

        // chaining methods
        System.out.println(localDate.plusDays(5).minusMonths(5).plusWeeks(53));

        System.out.println("------" + "toEpochDayzz" + "------");
        System.out.println(LocalDate.ofEpochDay(localDate.toEpochDay()));

    }
}
