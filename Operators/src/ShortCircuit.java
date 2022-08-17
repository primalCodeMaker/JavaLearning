public class ShortCircuit {
// ShortCircuit - mechanizm w Javie, jesli pierwszą wartością w porównaniu operatorów jest false to program nie wywoluje kolenjych instrukcji
// ShortCircuit dziala rowniez dla alternatywy "||"
// aby ominac ShortCircuit i wymusic pelne dzialanie programu nalezy uzyc pojedynczego naku "&"  "|"

    public static void main(String[] args) {
        System.out.println("bool1 && bool2: " + (bool1() && (bool2())));
    }


    private static boolean bool1() {
        System.out.println("calling bool1: ");
        return false;
    }

    private static boolean bool2() {
        System.out.println("calling bool2: ");
        return false;
    }


}
