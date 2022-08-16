public class Ternary_Operator {

    public static void main(String[] args) {
        int a = 1;
        int b = -2;
        int result = a + b == 4 ? 12 : 15;
        String stringresult  = a + b >0 ? "a + b > 0" : "a + b <= 0";

        // int result = (true albo false) ? zwroc jezeli true : zwroc jezeli false    ...[cos jak if w Excelu :)]
        System.out.println(result);
        System.out.println(stringresult);

    }
}
