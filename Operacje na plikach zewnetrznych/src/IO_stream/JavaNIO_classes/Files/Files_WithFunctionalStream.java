package IO_stream.JavaNIO_classes.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Files_WithFunctionalStream {

    public static void main(String[] args) {
        Path path1 = Paths.get("src/IO_stream/JavaNIO_classes/testingFile.txt"); //testingFile.txt

//        Strem ktory zwraca sciezki do folderow i plikow
//        try {
//            Stream<Path> list = Files.list(path1);
//            List<Path> absolutes = list
//                    .filter(Files::isRegularFile)
//                    .map(Path::toAbsolutePath)
//                    .collect(Collectors.toList());
//            absolutes.forEach(System.out::println);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//      Stream, ktory czyta zawartosc pliku
        try {
            Stream<String> list = Files.lines(path1);
            List<String> absolutes = list
                    .collect(Collectors.toList());
            absolutes.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
