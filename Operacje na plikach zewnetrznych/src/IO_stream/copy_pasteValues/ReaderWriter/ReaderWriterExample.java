package IO_stream.copy_pasteValues.ReaderWriter;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ReaderWriterExample {

    public static void main(String[] args) throws IOException {


        File inputFile = new File("src/IO_stream/copy_pasteValues/someInputFile.txt");
        File outputFile = new File("src/IO_stream/copy_pasteValues/someOutputFile.txt");

        List<String> fileRead = readFile(inputFile);

    }

    private static List<String> readFile(final File inputFile) {
        try (
//                todo 3:05
                ) {

        }
    }


    private static void bufferedCopy(File inputFile, File outputFile) throws IOException {

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

