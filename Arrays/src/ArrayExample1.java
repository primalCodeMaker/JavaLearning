import java.util.Arrays;

public class ArrayExample1 {

    public static void main(String[] args) {
        ArrayExample1 arrayExamples = new ArrayExample1();
        arrayExamples.arraysExample1();

    }

    private void arraysExample1() {
        String[] array = new String[10];

        int i = 0;
        while(i < 5) {
            array[i] = "Hello new index: " + i;
            System.out.println(array[i]);
            i++;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        String completeContent = "";
        for (int k = 0; k < 7; k++) {
            completeContent = completeContent + array[k] + ",";
            System.out.println("print >>> " + array[k]);
        }
        System.out.println(completeContent);
    }



}
