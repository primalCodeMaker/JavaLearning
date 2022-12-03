package map;

import java.util.Arrays;
import java.util.Objects;

public class MapMain {


    public static void main(String[] args) {


         String[][] obj = {
                {"|", "_", "_", "|"},
                {"|", "_", "_", "|"},
                {"|", "_", "_", "|"},
        };

        for (String[] element : obj) {
            System.out.println(Arrays.toString(element));
        }
        String a = "|" + "_" + "_" + "|";
        String b = "|" + "_" + "_";
        String c = "_" + "_" + "|";

        System.out.println(a + b + c + "\n" + a + b + c + "\n" + a + b + c);

        char e = '\u2581';
        char d = '\u2595';
        char g = '\u2594';
        System.out.println(e);
        System.out.println(d);
        System.out.println(g);

        System.out.println("_"+"-");

    }
}