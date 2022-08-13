public class Comparison {

    public static void main(String[] args) {
        Comparison comparison = new Comparison();
        comparison.stringComparison();
    }

    private void numericComparison() {
        int a = 1;
        int b = 2;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
    private void stringComparison() {
        String a = "World1";
        String b = "World1";

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a.equals(b): " + (a.equals(b)));

        String c = "NewSentence";
        String d = new String("NewSentence");

        System.out.println("c == d: " + (c == d));
        System.out.println("c != d: " + (c != d));
        System.out.println("c.equals(d): " + (c.equals(d)));

    }

}
