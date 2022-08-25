import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {
        int [] array = {24, 11, 1, 54, 2, 6};
        System.out.println("Non sorted array: " + Arrays.toString(array));
        bubblesort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static void bubblesort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j-1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println("Swap: " + Arrays.toString(array));

                } else {
                    System.out.println("Don't swap: " + array[j - 1] + " and " + array[j]);
                }
            }
            System.out.println(i + " i iteration " + Arrays.toString(array));
            System.out.println();
        }


    }
}
