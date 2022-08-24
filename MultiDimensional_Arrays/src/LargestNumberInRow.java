import java.util.Arrays;

public class LargestNumberInRow {

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 8, 9},
                {2, 5, 1},
                {3, 9, 7},

        };
        largestNumberInRow(matrix);

    }

    private static void largestNumberInRow(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int [] podtablica = matrix[row];
                int largest = podtablica[0];

           // int largest = matrix[row] [0];

            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > largest) {
                    largest = matrix[row][column];
                }
            }
            System.out.println("Largest Element in row: " + Arrays.toString(matrix[row]) + " el: " + largest );
        }
    }

}
