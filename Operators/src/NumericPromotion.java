public class NumericPromotion {

    public static void main(String[] args) {
        byte a = 4;
        short b = 5;
        int c = a + b;
        long d = 10;
        long e = c + d;

        System.out.println(e);

        short f = 1;
        float g = 2;
        double h = 3;
        double j = a * b / c;
        System.out.println(j);


    }


}
