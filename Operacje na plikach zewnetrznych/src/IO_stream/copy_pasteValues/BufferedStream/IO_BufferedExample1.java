package IO_stream.copy_pasteValues.BufferedStream;

import java.io.*;
import java.util.Arrays;

public class IO_BufferedExample1 {

    public static void main(String[] args) throws IOException {


      //  File inputFile = new File("src/IO_stream/copy_pasteValues/BufferedStream/someInputFile.txt");
       // File outputFile = new File("src/IO_stream/copy_pasteValues/BufferedStream/someOutputFile.txt");


        File inputFile = new File("src/IO_stream/copy_pasteValues/someInputFile.txt");
        File outputFile = new File("src/IO_stream/copy_pasteValues/someOutputFile.txt");


        bufferedCopy(inputFile, outputFile);

    }

    private static void bufferedCopy(File inputFile, File outputFile) throws IOException {
        try (
                InputStream input = new BufferedInputStream(new FileInputStream(inputFile));
                OutputStream output = new BufferedOutputStream(new FileOutputStream(outputFile))
        ) {
            byte[] buffer = new byte[4];
            int length = input.read(buffer);
            System.out.printf("start buffered reading file: [%s]%n", inputFile);
            System.out.printf("Readin buffered Valures[%s], chars: [%s], length: [%s]%n", byteArrayToString(buffer), toCharString(buffer), length);

            while (length > 0) {
                System.out.printf("Writing buffered values: [%s], chars: [%s]%n", byteArrayToString(buffer), toCharString(buffer), length);
                output.write(buffer, 0, length);
                output.flush();

                length = input.read(buffer);
                System.out.printf("Readin buffered Valures[%s], chars: [%s], length: [%s]%n", byteArrayToString(buffer), toCharString(buffer), length);

            }
        }
    }

    static String toCharString(byte[] input) {
        char[] charArray = new char[input.length];

        for (int i = 0; i < input.length; i++) {
            charArray[i] = (char) input[i];
        }
        return replaceNewLines(Arrays.toString(charArray));

    }

    static String byteArrayToString(byte[] input) {
        return replaceNewLines(Arrays.toString(input));

    }

    private static String replaceNewLines(String input) {
        return input.replace("\n", "\\n").replace("\r", "\\r");
    }
}

