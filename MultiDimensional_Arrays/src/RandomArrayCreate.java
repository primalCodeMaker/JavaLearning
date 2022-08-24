import java.util.Arrays;

public class RandomArrayCreate {

    public static void main(String[] args) {

        int[][] matrix = createMatrix(4, 6);
        printArray2(matrix);
    }


    // metoda do tworzenia tablicy 2 wymiarowej intow
    private static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = generateRandomValue();
            }
        }
        return matrix;
    }


    //metoda do generowania wartosci losowych:
    private static int generateRandomValue() {
        int min = 0;
        int max = 10;
        return (int) (Math.random() * ((max - min) + 1)) + min;

    }

    // pierwsza metoda do wydrukowania wygenerowanej losowo tablicy (gorzej to wyglada)
    private static void printArray1(int[][] toPrint1) {
        for (int row = 0; row < toPrint1.length; row++) {
            for (int column = 0; column < toPrint1[row].length; column++) {
                System.out.println("accessign: [" + row + "][" + column + "]: " + toPrint1[row][column]);

            }
        }
    }
    // druga metoda do wydrukowania wygenerowanej losowo tablicy (lepiej to wyglada)
    private static void printArray2 (int[][] toPrint2) {
        for (int[] internArray : toPrint2) {
            System.out.println(Arrays.toString(internArray));
            }
        }

}