import java.util.Arrays;
// TODO dokonczyc mechanizm sortowania
public class ArraySort {

    public static void main(String[] args) {

        arraySort();

    }

    private static void arraySort() {
        int[] unSort = {7, 13, 9, 1};
        int[] sort = new int[unSort.length];
        int pos = 0;

        for (int i = 0; i < unSort.length; i++) {

            if (unSort[pos] > unSort[i] && unSort[pos] > unSort[i] && unSort[pos] > unSort[i] && unSort[pos] > unSort[i]) {
                sort[pos] = unSort[i];

                System.out.println(i);
                System.out.println(pos);

                sort[pos] = unSort[i];







                System.out.println(Arrays.toString(sort));





            }


         }


        }

    }
