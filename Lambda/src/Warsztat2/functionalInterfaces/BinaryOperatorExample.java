package Warsztat2.functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<String> binaryOperator = (s1, s2) -> {
            System.out.println();
            return s1.toLowerCase()
                    .concat(s2.toUpperCase());
        };

        String apply = binaryOperator.apply("lubie", "placki");
        System.out.println(apply);

//------------------------------------------------------------------------
        System.out.println("example2 ");

        // w tej lambdzie uzywamy metody concat z klasy String dla 2 parametrów
       // BinaryOperator<String> concat = (s1, s2) -> s1.concat(s2);

        BinaryOperator<String> concat = String::concat;
        System.out.println(concat.apply("Kasia ", "Angelika"));
    }
}
