package localDate_and_localTime;

import java.time.LocalDate;

public class Before_After_LeapYear {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2022,10,27);
        LocalDate localDate2 = LocalDate.of(2022,10,28);

        System.out.println("isBefore: " + localDate1.isBefore(localDate2));
        System.out.println("isLeapYear: " + localDate1.isLeapYear());   // czy rok jest przestepny
        System.out.println("isAfter: " + localDate1.isAfter(localDate2));
    }
}
