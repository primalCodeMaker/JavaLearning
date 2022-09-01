import java.util.Arrays;

public class ArrayValueToString {

    public static void main(String[] args) {
        String a, b, c;

        String[] arr1 = new String[] {"10:00", "15:00", "20:00"};

        System.out.println("wydruk mojej tablicy: " + Arrays.toString(arr1));
        a = arr1[0];
        b = arr1[1];
        c = arr1[2];

        System.out.println("teraz nie ma []: " + a + "  " + b + "  " + c);

    }
}
