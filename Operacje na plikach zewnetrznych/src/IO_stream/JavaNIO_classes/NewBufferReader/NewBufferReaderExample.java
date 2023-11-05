package IO_stream.JavaNIO_classes.NewBufferReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBufferReaderExample {

    public static void main(String[] args) {

        Path path1 = Paths.get("src/IO_stream/JavaNIO_classes/testingFile.txt");
        Path newPath = Paths.get("src/IO_stream/JavaNIO_classes/testingNewPath.txt");

        myNewBufferedReader(path1);
        myNewBufferedWriter(newPath);

//        System.out.println("nothik happened");
    }

    private static void myNewBufferedReader(Path anyPath) {
        try (BufferedReader reader = Files.newBufferedReader(anyPath)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println("line: " + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void myNewBufferedWriter(Path anyPath) {
        try (BufferedWriter writer = Files.newBufferedWriter(anyPath)) {
            writer.write("NEW LINE from WRITER\n");
            writer.write("SECOND NEW LINE from WRITER\n");
            writer.write("ąęćńłż ĄŚĆŻŁĘĘ SECOND NEW LINE from WRITER WITH POLISH");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
