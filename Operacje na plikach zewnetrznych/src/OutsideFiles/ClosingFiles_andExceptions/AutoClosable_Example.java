package OutsideFiles.ClosingFiles_andExceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AutoClosable_Example {

    public static void main(String[] args) {

        example(Paths.get("notepad.txt"), Paths.get("NewNotepad.txt"));

    }

    public static void example(final Path path1, final Path path2) {
        try (Door door = new Door()) {
            System.out.println("Opening door");
        } catch (IOException e) {
            System.out.println("Handling door exception" + e.getMessage());
        } finally {
            System.out.println("callin' finally");
        }
    }

    static class Door implements AutoCloseable {

        public Door() {
            System.out.println("new door created");


        }

        @Override
        public void close() throws IOException {
            System.out.println("dor closed");
        }
    }
}