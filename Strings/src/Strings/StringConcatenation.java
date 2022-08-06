package Strings;

public class StringConcatenation {

    public static void main(String[] args) {

        String hello = "Hello";
        String space = " ";
        String world = "world";
        String exclamation = "!";

        String result1 = hello + space + world + exclamation; // metoda dodawania wielu Stringow do siebie nie jest dobra z punktu optymalizacji bo nie może zwrócić samego "hello world", tylko calosc
        System.out.println("result variable: " + result1);
        System.out.println("result1: " + hello + space + world + exclamation);

        String result2 = 10 + 20 + result1 + 30 + 40 + true;

        System.out.println("result2 variable: " + result2);
        System.out.println("result2: " + 10 + 20 + result1 + 30 + 40);
        System.out.println();


        // jesl przed Stringiem są liczby to równania wykonują sie, a potem konwertuje się to na String
        // jesli równania są po Stringu są traktowane jako String
        // aby równania wykonywały się po stringu trrzeba je zamknac w nawias


        hello.concat(space).concat(world).concat(exclamation); // nie wyswietla bledu, ale jak nie jest przypisane do zadnej zmiennej to nie moze zostac wykozystane i zgubi sie w pamieci

        String result3 = hello.concat(space).concat(world).concat(exclamation);
        System.out.println("res3 var: " + result3);
        System.out.println("res3 without variable: " + hello.concat(space).concat(world).concat(exclamation));;

        StringBuilder ex1 = new StringBuilder();
        ex1.append(hello);
        ex1.append(space);
        ex1.append(world);
        ex1.append(exclamation);
        System.out.println("String Builder ex1: " + ex1);
        System.out.println("String Builder ex1 + .toString: " + ex1.toString());


    }
}
