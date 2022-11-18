package oprional.methods;

import java.util.Optional;

public class Get {

    public static void main(String[] args) {

        Optional<String> op2 = Optional.of("somethink is  here");

        if (op2.isPresent()) {
            String value = op2.get();
            System.out.println(value);
            // Jesli wywolamy .get() na Optionalu, ktory jest pusty to dostaniemy wyjatek NoValue Present
        }
    }
}
