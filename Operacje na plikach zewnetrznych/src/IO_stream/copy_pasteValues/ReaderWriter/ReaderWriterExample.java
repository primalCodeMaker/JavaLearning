package IO_stream.copy_pasteValues.ReaderWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReaderWriterExample {

    public static void main(String[] args) throws IOException {


        File inputFile = new File("src/IO_stream/copy_pasteValues/someInputFile.txt");
        File outputFile = new File("src/IO_stream/copy_pasteValues/someOutputFile.txt");

        List<String> fileRead = readFile(inputFile);
        writeFile(outputFile, fileRead);

    }

    private static List<String> readFile(final File inputFile) throws IOException {
        List<String> result = new ArrayList<>();
        try (
                BufferedReader buffReader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8))) {

            String lineReader = buffReader.readLine();
            while (lineReader != null) {
                result.add(lineReader);
                lineReader = buffReader.readLine();
            }
        }
        return result;
    }


    private static void writeFile(File outputFile, List<String> fileRead) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8))) {
            for (String line : fileRead) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();

            }
        }
    }

}

