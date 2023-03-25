package Warsztat2;

import java.util.function.Function;

public class LambdaVsRuntimeException extends RuntimeException {

    public static void main(String[] args) {

        Function<Integer, String> function = i -> {
            if (i > 0) {
                throw new RuntimeException(i + " what iz wrong with ya' duuuude!");
            } else {
                i.toString();
            }
            return i.toString();
        };

        System.out.println(function.apply(1));
        System.out.println("program working ...");
    }
}
