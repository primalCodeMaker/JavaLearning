package oprional.methods;

import java.util.Optional;

public class orElse_orElseGet {

    public static void main(String[] args) {

        Optional<String> op1 = Optional.empty();
        Optional<String> op2 = Optional.of("somethink is  here");
//        System.out.println(op1.get()); >>>>  Jesli wywolamy .get() na Optionalu, ktory jest pusty to dostaniemy wyjatek NoValue Present

        String empty = op1.orElse("String variable for Empty Optional without Exception");
        System.out.println(empty);


        String variable1 = op1.orElse(default1());
        String variable2 = op1.orElseGet(() -> default2());  // ta metoda wywoluje sie TYLKO gdy chcemy pobrac wartosc EMPTY
        // w metodzie .orElseGet(() wywolujemy lambde Supplier, ktora nie przyjmuje zadnych argumentow i zwraca "cos"
    }

    private static String default1() {
        System.out.println("default1");
        return "dafault1";
    }

    private static String default2() {
        System.out.println("default2");
        return "default2";
    }
}

