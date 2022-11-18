package oprional.methods;

import java.util.Optional;

public class orElseThrow {

    public static void main(String[] args) {

        Optional<String> op1 = Optional.empty();
        Optional<String> op2 = Optional.of("somethink is  here");
        Optional<String> op3 = Optional.ofNullable(null);

//        op1.orElseThrow();  Jesli wywolamy .orElseThrow() na Optionalu, ktory jest pusty to dostaniemy wyjatek NoValue Present

        op1.orElseThrow(() -> new RuntimeException("empty Optional!!"));  // Supplier z wyjatkiem Runtime
//         jesli bysmy uzyli Checked Exception to trzeba by było go od razu obsluzyc - opakowac w Try /Check
//             albo dolozyc Throws do metody ktora wywoluje ten wyjatek. (W tym przypadku main)

    }
}
