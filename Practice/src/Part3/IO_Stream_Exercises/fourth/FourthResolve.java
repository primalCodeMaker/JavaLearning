package Part3.IO_Stream_Exercises.fourth;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Comparator;
import java.util.List;

public class FourthResolve {
    /*
        Napisz program, który w podanym przez Ciebie katalogu znajdzie dowolny plik, z najstarszą i
        najmłodszą datą modyfikacji. Przeszukaj wszystkie pliki w katalogu, również te zagłębione
     */

    public static void main(String[] args) throws IOException {

        Path path = Paths.get(".");
        printOldestAndNewest(path);

    }

    private static void printOldestAndNewest(Path path) throws IOException {
        List<Path> sortedPaths = Files.walk(path)
                .filter(Files::isRegularFile)
                .sorted(Comparator.comparing(p -> getFileTime(p)))
                .toList();
        if (sortedPaths.isEmpty()) {
            System.out.printf("no files found.");
            return;
        }
        System.out.printf("Oldest file is: %s, Newest file is: %s",
                sortedPaths.get(0),
                sortedPaths.get(sortedPaths.size() - 1));
    }

    private static FileTime getFileTime(Path p) {
        try {
            return Files.getLastModifiedTime(p);
        } catch (IOException e) {
            e.printStackTrace();
            return FileTime.fromMillis(0);
        }
    }
}