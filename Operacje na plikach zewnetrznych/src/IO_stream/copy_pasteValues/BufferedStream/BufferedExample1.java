package IO_stream.copy_pasteValues.BufferedStream;

import java.io.*;

public class BufferedExample1 {

    public static void main(String[] args) throws IOException {

        //todo film 5:01 min

        File inputFile = new File("src/IO_stream/copy_pasteValues/BufferedStream/someInputFile.txt");
        File outputFile = new File("src/IO_stream/copy_pasteValues/BufferedStream/someOutputFile.txt");

        bufferedCopy(inputFile, outputFile);

    }
    private static void bufferedCopy(File inputFile, File outputFile) throws IOException {
        try (
                InputStream input = new BufferedInputStream(new FileInputStream(inputFile));
                OutputStream output = new BufferedOutputStream(new FileOutputStream(outputFile))
        ) {
            byte[] buffer = new byte[1024];
            int value = input.read(buffer);
            System.out.printf("start buffered reading file: [%s]%n", inputFile);
            System.out.printf("Readin Valures[%s], chars: [%s]%n", value, (char)value);

            while (value != -1) {
                output.write(value);
                value = input.read();
                System.out.printf("Readin Valure[%s], char: [%s]%n", value, (char)value);

            }
        }
    }
}

