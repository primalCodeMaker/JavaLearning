public class For_With_Method {

    public static void main(String[] args) {

        for (int i =1;method(i); i++) {
            System.out.println("i: " + 1);
        }
        System.out.println("E N D");

        System.out.println("--------------");
        System.out.println("--------------");

        System.out.println("for with 2 variables");
        for (int a = 1, b = 10; a  < 10 && b > 5; a++, b--) {
            System.out.println("a: " + a + ", b: " + b);

        }

    }

    private static boolean method(int i) {
        System.out.println("checking i: " + i);
        return i < 5;
    }


}
