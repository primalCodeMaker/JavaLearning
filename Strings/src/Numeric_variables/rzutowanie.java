package Numeric_variables;

public class rzutowanie {

    public static void main(String[] args) {

        byte a = 127;
        short b = 32767;
        System.out.println(a);
        System.out.println(b);

        byte c = (byte) 130  ;
        short d = (short) 40000;
        System.out.println(c);
        System.out.println(d);

        int e = 10;
        double f = (double)e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        double g = 100.0;
        int h = (int)g;

        System.out.println("g = " + g);
        System.out.println("h = " + h
        );

    }
}
