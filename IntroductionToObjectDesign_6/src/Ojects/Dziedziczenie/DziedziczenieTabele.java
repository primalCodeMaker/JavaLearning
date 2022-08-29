package Ojects.Dziedziczenie;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DziedziczenieTabele {

    public static void main(String[] args) {

        TV[] tab1 = new TV[5];
        tab1[0] = new Rubin();
        tab1[1] = new Samsung();
        tab1[4] = new TV();
        System.out.println(Arrays.toString(tab1));
    }

}
