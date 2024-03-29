package Part3.IO_Stream_Exercises.five;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
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
        TreeMap<Integer, List<String>> searchingValues = Files.lines(path)
                .map(charr -> charr.replace(".", "").replace(",", ""))
                .flatMap(lines -> Stream.of(lines.split(" ")))
                .collect(Collectors.groupingBy(key -> key.length(), TreeMap::new, Collectors.toList()));

        Integer maxLength = searchingValues.keySet().stream().max(Comparator.comparingInt(a -> a)).orElseThrow();

        System.out.println("second 3-letter word: " + searchingValues.get(3).get(1));
        System.out.println("first longest word: " + searchingValues.get(maxLength).get(1));
    }

}

