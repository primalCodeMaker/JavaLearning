public class OperatorsPrecedence {

    public static void main(String[]rgs) {
        someMethod(sm1() + sm2() * sm3(sm4(), sm5()));
    }

    private static void someMethod(int someArgument) {
        System.out.println("someMethod");
    }

    private static int sm1() {
        System.out.println("sm1");
        return 1;
    }
    private static int sm2() {
        System.out.println("sm2");
        return 2;
    }
    private static int sm3(int i, int sm5) {
        System.out.println("sm3");
        return 3;
    }
    private static int sm4() {
        System.out.println("sm4");
        return 4;
    }
    private static int sm5() {
        System.out.println("sm5");
        return 5;
    }


}
