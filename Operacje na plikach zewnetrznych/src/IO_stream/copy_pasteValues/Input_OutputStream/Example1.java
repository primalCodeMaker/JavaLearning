package IO_stream.copy_pasteValues.Input_OutputStream;

import java.io.*;

public class Example1 {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("src/IO_stream/copy_pasteValues/Input_OutputStream/someInputFile.txt");
        File outputFile = new File("src/IO_stream/copy_pasteValues/Input_OutputStream/someOutputFile.txt");

        copyOnly(inputFile, outputFile);

    }

    private static void copyOnly(File inputFile, File outputFile) throws IOException {
        try (
                InputStream input = new FileInputStream(inputFile);
                OutputStream output = new FileOutputStream(outputFile);
        ) {
            int value = input.read();
            System.out.printf("start reading file: [%s]%n", inputFile);
            System.out.printf("Readin Valure[%s], char: [%s]%n", value, (char)value);

            while (value != -1) {
                output.write(value);
                value = input.read();
                System.out.printf("Readin Valure[%s], char: [%s]%n", value, (char)value);

            }

        }
    }
}

