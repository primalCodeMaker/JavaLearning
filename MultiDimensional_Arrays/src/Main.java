import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        forEachEx();

//        int[][] tab1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//
//
//        for (int row = 0; row < tab1.length; row++) {
//            for (int col = 0; col < tab1[row].length; col++) {
//                System.out.println(tab1[row][col]);
//            }


    }


    private static void forEachEx() {
        int[] tab2 = {1, 2, 3, 4, 5};
        for (int i : tab2) {
            System.out.println(i);
        }
    }
}