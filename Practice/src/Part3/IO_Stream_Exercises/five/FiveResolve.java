package Part3.IO_Stream_Exercises.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiveResolve {
    /*
    Napisz program, który znajdzie drugie najdłuższe słowo i drugie słowo o długości 3 w podanym przez Ciebie pliku
    Do wygenerowania zawartości pliku wykorzystaj https://pl.lipsum.com
     */

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./src/Part3/workingCatalog/CatalogInside2/anotherFile.txt");

        printSpecyficWord(path);

    }

    private static void printSpecyficWord(Path path) throws IOException {
        Files.lines(path)
                .map(charr -> charr.replace(".", "").replace(",", ""))
                .flatMap(lines -> Stream.of(lines.split(" ")))
                .collect(Collectors.groupingBy(key -> key.length()))
                .forEach((a, b) -> System.out.println(a.equals(3)));
//                .forEach((a, b) -> a.equals(3) && (a.MAX_VALUE), b-> System.out.println(b));


    }
}
