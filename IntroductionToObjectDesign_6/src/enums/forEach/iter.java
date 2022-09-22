package enums.forEach;

import enums.withConstructor.Volkswagen2;

import java.util.Arrays;

public class iter {

    public static void main(String[] args) {
        Volkswagen3[] values = Volkswagen3.values();
        System.out.println(Arrays.toString(values));

        for (Volkswagen3 value : values) {
            System.out.println(value);

        }
        System.out.println("---");
        Volkswagen3 vestfalia = Volkswagen3.valueOf("VESTFALIA");
        System.out.println(vestfalia);
    }
}
