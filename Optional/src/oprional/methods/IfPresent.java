package oprional.methods;

import java.util.Optional;

public class IfPresent {

    public static void main(String[] args) {
        Optional<String> op1 = Optional.empty();
        Optional<String> op2 = Optional.of("somethink is  here");

        // zapis Funkcyjny
        op2.ifPresent(element -> System.out.println(element));
        op1.ifPresentOrElse(element -> System.out.println(element), () -> System.out.println("EMPTY VALUE"));


        // ifPresentOrElse() >>> rownowazne z tym zapisame:
//        if (op1.isPresent()) {
//            System.out.println(op1.get());
//        } else {
//            System.out.println("EPMTY VALUE");
//        }
    }


}
