package Warsztat2.functionalInterfaces;

import java.util.Optional;

public class FunctionExample2 {

    public static void main(String[] args) {

        Optional<BiConsumerExample.Cat> modify = Optional.of(("blablablabla")).map(s -> new BiConsumerExample.Cat());
        Optional<BiConsumerExample.Cat> modify2 = Optional.empty().map(s -> new BiConsumerExample.Cat());
        System.out.println(modify);
        System.out.println(modify2);
    }
}
