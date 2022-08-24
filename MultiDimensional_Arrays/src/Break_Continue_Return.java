import java.util.Arrays;

public class Break_Continue_Return {

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 8, 9},
                {2, 5, 1},
                {3, 9, 7},

        };
        breakAndContinueExample(matrix);

    }

    private static void breakAndContinueExample(int[][] example) {
        for (int row = 0; row < example.length; row++) {
            if (row > 1) {
                break;
               // return;
            }


            for (int column = 0; column < example[row].length; column++) {
                if (column < 1) {
                    continue;
            }
                    System.out.println("accessign: [" + row + "][" + column + "]: " + example[row][column]);
            }
        }
        System.out.println("I am here");
    }


}
