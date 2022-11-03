package localDate_and_localTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;

public class YearDay_Epoch {
    public static void main(String[] args) {

        LocalDate dayOfYear = LocalDate.ofYearDay(2020, 200);
        System.out.println(dayOfYear);

        //EPOCH >>> jednostka czasu w informatyce liczona od poczatku 1970r
        System.out.println(LocalDate.ofEpochDay(-18520));
        System.out.println(LocalDate.EPOCH); // drukowanie stalej EPOCH
    }
}
