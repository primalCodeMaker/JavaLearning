package IO_stream.copy_pasteValues.BufferedReader;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Buffered_Reader_Example1 {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("src/IO_stream/copy_pasteValues/BufferedReader/someInputFile.txt");
        File outputFile = new File("src/IO_stream/copy_pasteValues/BufferedReader/someOutputFile.txt");

        List<String> fileReader = readFile(inputFile);
        fileReader.forEach(System.out::println);

        writeFile(outputFile, fileReader);

    }

    private static List<String> readFile(final File inputFile) throws IOException {
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8))) {
            String line = reader.readLine();

            while (line != null) {
                result.add(line);
                line = reader.readLine();

            }
        }
        return result;
    }

    private static void writeFile(File outputFile, List<String> fileReader) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8))) {
            for (String line : fileReader) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}

