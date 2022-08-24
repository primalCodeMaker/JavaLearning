import java.util.Arrays;

public class MultiDimensional_Arrays2 {

    public static void main(String[] args) {

        int[][] array2 = new int[4][];
        array2[0] = new int[5];
        array2[1] = new int[3];
        array2[2] = new int[2];
        array2[3] = new int[8];
        System.out.println(Arrays.toString(array2[0]));
        System.out.println(Arrays.toString(array2[1]));
        System.out.println(Arrays.toString(array2[2]));
        System.out.println(Arrays.toString(array2[3]));


    }
}
