package Warsztat2;

import java.util.function.Supplier;

public class LambdaVsExceptions {

    public static void main(String[] args) {

    Supplier<String> supp1 = LambdaVsExceptions::wrappdException;

    Supplier<String> supp2 = () -> stringRuntimeException();

        System.out.println(supp1.get());
        System.out.println(supp2.get());
    }
// w lambdach wyjatki checked Exception trzeba od razu obslugiwac. Nie mozna ich zucic dalej z maina
    // dobrze jest to owrapowac w metode bo jest bardziej czytelne
    private static String wrappdException() {
        try {
            return stringCheckException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "excepion catch!";
    }

    private static String stringCheckException() throws Exception {
        throw new Exception();
        //return "stringCheckException";
    }

    private static String stringRuntimeException() throws RuntimeException {
        return "stringRuntimeException";
    }
}
