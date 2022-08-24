public class MultiDimensional_Arrays_Loop_Row_Columns {

    // drukowanie tablicy przechodzac po wszystkich jej elementach (tablice zagniezdzone w tablicach)

    public static void main(String[] args) {
        String[][] array = {
                {"g1e1", "g1e2"},
                {"g2e1", "g2e2", "g2e3"},
                {"g3e1", "g3e2", "g3e3", "g3e4"},
                {"g4e1", "g4e2"}
        };

        printArray1(array);
    }
        private static void printArray1 (String[][] toPrint1) {
        for (int row = 0; row < toPrint1.length; row++) {
            for (int column = 0; column < toPrint1[row].length ; column++) {
                System.out.println("accessign: [" + row + "][" + column + "]: " + toPrint1[row][column]);

            }

        }
    }

    private static void printArray2 (String[][] toPrint2) {
        for (String[] internArray : toPrint2) {
            for (String element : internArray) {
                System.out.println(element);
            }
        }
    }
}