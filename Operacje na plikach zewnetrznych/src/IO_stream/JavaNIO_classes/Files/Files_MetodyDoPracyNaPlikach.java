package IO_stream.JavaNIO_classes.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

public class Files_MetodyDoPracyNaPlikach {

    public static void main(String[] args) {

        Path path1 = Paths.get("src/IO_stream/JavaNIO_classes/testingFile.txt");
        Path newPath = Paths.get("src/IO_stream/JavaNIO_classes/testingNewPath.txt");
        Path nonEgzistPath = Paths.get("srac/IO_stream/JavaNIO_classes/testingNewPath.txt");


//        Files.size(path1) << metoda zwracajaca wielkosc pliku w bytach. Polskie znaki sa zapisywane na 2 bajtach
        try {
            System.out.println(Files.size(path1));
        } catch (IOException e) {
            e.printStackTrace();
        }

//      isRegularFile()    isDirectory()
        System.out.println(Files.isDirectory(path1));
        System.out.println(Files.isRegularFile(path1));

//      isHidden()  << sprawdza czy plik jest ukryty
        try {
            System.out.println(Files.isHidden(path1));
        } catch (IOException e) {
            e.printStackTrace();
        }


//      Files.isReadable()  << sprawdza czy plik jest czytalny
        System.out.println(Files.isReadable(path1));
//      Files.isExecutable()  << sprawdza czy plik jest wykonywalny
        System.out.println(Files.isExecutable(path1));


        System.out.println("\n##########################################################");
        System.out.println("       #########################################");
        System.out.println("               #########################\n");

//      Files.setLastModifiedTime()  << ustawia czas ostatniej modyfikacji, mozna na NOW, a mozna na wybrany
        // ponizej wyciagniete do metody
        FileTime now = FileTime.fromMillis(System.currentTimeMillis());
        setLastTimeModification(path1, now);
        setLastTimeModification(path1, FileTime.from(259654L, TimeUnit.HOURS));


//      Files.getLastModifiedTime()      sprawda czas ostatniej modyfikacji
        try {
            System.out.println(Files.getLastModifiedTime(path1));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void setLastTimeModification(Path path1, FileTime now) {
        try {
            if (true) {
                Files.setLastModifiedTime(path1, now);
                System.out.println("setLastModifiedTime updatef");
            } else {
                System.out.println("no change");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
