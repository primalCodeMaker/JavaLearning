package OutsideFiles.ClosingFiles_andExceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryCatch_WithResources {

    public static void main(String[] args) {

        example(Paths.get("notepad.txt"), Paths.get("NewNotepad.txt"));

    }

    public static void example(final Path path1, final Path path2) {
        try (
                BufferedReader in = Files.newBufferedReader(path1);
                BufferedWriter out = Files.newBufferedWriter(path2)
        ) {
            String line = in.readLine() + " new one created by JAva in TryCatch_WithResources :)";
            out.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
