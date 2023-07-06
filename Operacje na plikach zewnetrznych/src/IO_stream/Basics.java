package IO_stream;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Basics {

    public static void main(String[] args) {

        System.out.println(Charset.defaultCharset());
        String testSentence = ("something is here źćążę");
        System.out.println(testSentence);

        byte[] swichToBytes = testSentence.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(swichToBytes));

        String switchToStringUTF_8 = new String(swichToBytes, StandardCharsets.UTF_8);
        String switchToStringUTF_16 = new String(swichToBytes, StandardCharsets.UTF_16);
        System.out.println("switchToStringUTF_8: " + switchToStringUTF_8);
        System.out.println("switchToStringUTF_16: " + switchToStringUTF_16);

        //wszystkie mozliwe kodowania:
        //Charset.availableCharsets().keySet().forEach(a -> System.out.println(a));

        // rzutowanie inta na chara:
        int someInt = 66;
        System.out.println("\n" + someInt);
        System.out.println((char) someInt);

        char someChar = 'Z';
        System.out.println(someChar);
        System.out.println((int) someChar);


    }
}
