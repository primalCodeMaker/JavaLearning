package Number_and_Date_Formater;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_Class {

    public static void main(String[] args) {

        int number = 123_456_789;
        Locale pl = new Locale("pl", "PL");
        Locale us = Locale.US;
        Locale de = Locale.GERMANY;

        NumberFormat numberInstanceDEF = NumberFormat.getNumberInstance();
        NumberFormat numberInstancePL = NumberFormat.getNumberInstance(pl);
        NumberFormat numberInstanceUS = NumberFormat.getNumberInstance(us);
        NumberFormat numberInstanceSTH = NumberFormat.getNumberInstance(new Locale("fr", "ES"));

        System.out.println("NumberFormat.getNumberInstance()");
        System.out.println("numberInstanceDEF " + numberInstanceDEF.format(number));
        System.out.println("numberInstancePL " + numberInstancePL.format(number));
        System.out.println("numberInstanceUS " + numberInstanceUS.format(number));
        System.out.println("numberInstanceSTH " + numberInstanceSTH.format(number));

        System.out.println();
        System.out.println("NumberFormat.getPercentInstance()");
        System.out.println("percentInstancePL " + NumberFormat.getPercentInstance(pl).format(number));
        System.out.println("percentInstanceUS " + NumberFormat.getPercentInstance(us).format(number));
        System.out.println("percentInstanceSTH " +NumberFormat.getPercentInstance(de).format(number));

        System.out.println();
        System.out.println("NumberFormat.getCurrencyInstance()");
        System.out.println("currencyInstancePL " + NumberFormat.getCurrencyInstance(pl).format(number));
        System.out.println("currencyInstanceUS " + NumberFormat.getCurrencyInstance(us).format(number));
        System.out.println("currencyInstanceSTH " +NumberFormat.getCurrencyInstance(de).format(number));



    }
}
