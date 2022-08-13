public class Operators {
    /*
        addition
        subtraction
        multiplication
        division
        modulus
     */

    public static void main(String[] args) {
        Operators operators = new Operators();
        operators.modulus();

    }

    private void addition() {
        int a = 100 + 50;
        int b = a + 250;
        int c = b + b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    private void subtraction() {
        int a = 100 - 50;
        int b = a - 250;
        int c = b - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    private void multiplication() {
        int a = 100 * 50;
        int b = a * 2;
        int c = b * b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    private void division() {
        int a = 10 / 2;
        int b = a / 2;
        int c = b / b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        double d = 4/3;
        double e = (double) 4/3;
        double f = 4/(double)3;
        double g = (double)(4/3);

        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("g: " + g);
    }
    private void modulus() {
        int a = 4 % 3;
        int b = 11 % 3;
        int c = b % b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

}
