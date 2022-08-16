public class Ternary_Op_Method {

    public static void main(String[] args) {
        int a = 1;
        int b = -2;
        String stringResult  = a + b > 0 ? someMethod1() : someMethod2();
        // metoda nie moze byc typu void poniewaz musi cos zwracac

        System.out.println(stringResult);

    }

    private static String someMethod1() {
        return "someMethod1";
    }
    private static String someMethod2() {
        return "someMethod2";
    }


    // warjacja z metodami
    public static String someMethod100(int a, int b) {
        return a + b > 0 ? someMethod1() : someMethod2();
    }

    // warjacja z metodami lvl UBER-HARD
        private static String someMethod999(int a, int b) {
        return a + b > 0
                ? a - b > 5
                    ? "2"
                    : "4"
                : a * b > 10
                    ? "a"
                    : "2";
    }

}
