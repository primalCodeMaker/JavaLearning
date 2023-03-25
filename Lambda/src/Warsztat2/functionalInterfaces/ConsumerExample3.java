package Warsztat2.functionalInterfaces;

import java.util.Optional;

public class ConsumerExample3 {

    public static void main(String[] args) {

        Optional.of(1).ifPresent(val -> System.out.println(val + " izPresent"));

        Optional.empty().ifPresent(val -> System.out.println(val + " izPresent"));
    }
}
