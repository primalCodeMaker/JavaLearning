package period;

public class Period {

    public static void main(String[] args) {

        System.out.println(java.time.Period.of(10,2,60));  //P10Y2M60D

        System.out.println(java.time.Period.ofDays(2));
        System.out.println(java.time.Period.ofWeeks(55));
        System.out.println(java.time.Period.ofMonths(2));
        System.out.println(java.time.Period.ofYears(2));

        System.out.println(java.time.Period.ofWeeks(5).ofMonths(1)); //P1M wynikiem jest ostatnia metoda statyczna

    }
}
