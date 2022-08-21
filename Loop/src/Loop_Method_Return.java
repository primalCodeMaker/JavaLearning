public class Loop_Method_Return {

    public static void main(String[] args) {
       String variable = loopExample();
        System.out.println(variable);

    }

    private static String loopExample () {
        for (int i = 0; i < 3; i++) {
//            if (i == 0) {
//                break;
//            }
            System.out.println("i: " + i);
            for (int j = 0; j < 3 ; j++) {
                System.out.println("i + j " + j);
                for (int k = 0; k < 3; k++) {
                    System.out.println("i + j + k" + k);

                    if (j == 3) {
                        return "j == 3";
                    }
                }

            }

        }
        return "return w metodzie za petlami";
    }
}
