import java.util.Arrays;

public class ArrayExample2 {


    public static void main(String[] args) {


        ArrayExample2 arrayExamples2 = new ArrayExample2();
        arrayExamples2.arrayExample2();
    }


    private static void arrayExample2() {
        double[] array = new double[] {1.0, 2.0, 3.72, 3.0, 9.34, 1.29, 2.55, 1.23894};

        //total (suma w tablicy)
        double total = 0;
        for (double element : array) { //foreach loop
            total += element;
        }
        System.out.println("Total: " + total);

        // max wartosc
        double maximum = array[0];
        for (int i = 0; i<array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("Maximum: " + maximum);
    }
}
