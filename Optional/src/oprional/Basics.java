package oprional;

import java.util.Optional;

public class Basics {

    public static void main(String[] args) {

//      System.out.println(somethink());

//      sposoby inicjalizacji:
        Optional<String> op1 = Optional.empty();
        Optional<String> op2 = Optional.of("somethink is  here"); // tu moze byc wszystko w zaleznosci od typy generycznego
        Optional<String> op3 = Optional.ofNullable(null);

        Lam lam = (s) -> somethink(); {
            System.out.println(somethink());
        }

        System.out.println("Optional.ofNullable(null): " + op3); // Optional.Empty
    }

    private static Optional<String> somethink() {
        return Optional.empty();
    }
}
