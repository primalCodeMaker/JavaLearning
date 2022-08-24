import java.util.Arrays;

public class MultiDimensional_Arrays {

    /*
    Tablice jednowymiarowe - [1, 5, 9, 7]
    Tablice dwuwymiarowe -
    [
        [1, 3, 8],
        [2, 6, 7, 2, 1],
        [8, 93]
    ]
     */

    public static void main(String[] args) {
        String [][] array = {
                {"g1e1", "g1e2"},
                {"g2e1", "g2e2", "g2e3"},
                {"g3e1", "g3e2", "g3e3", "g3e4"},
                {"g4e1", "g4e2"}
        };
        System.out.println(Arrays.deepToString(array[0]));
        System.out.println(Arrays.deepToString(array[1]));
        System.out.println(Arrays.deepToString(array[2]));
        System.out.println(Arrays.deepToString(array[3]));

        System.out.println("access [2]: "+ Arrays.toString(array[2]));
        array[2][1] = "new";
        System.out.println("access [2][1]: "+ array[2][1]);

        System.out.println("element [0][0]:" + array[0][0]);
        System.out.println("element [0][1]:" + array[0][1]);
        System.out.println("element [1][0]:" + array[1][0]);

    }



}



