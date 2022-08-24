import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {

        int[][] matrix = {
                {0, 8, 9},
                {2, 5, 1},
                {3, 9, 7},

        };
        printSum(matrix);

    }

    private static void printSum (int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
            System.out.println("Array: " + Arrays.toString(matrix[row]) + " sum: " + sum);
        }
    }




}
