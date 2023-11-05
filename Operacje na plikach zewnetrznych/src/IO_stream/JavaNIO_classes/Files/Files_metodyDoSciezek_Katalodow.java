package IO_stream.JavaNIO_classes.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_metodyDoSciezek_Katalodow {

    public static void main(String[] args) {


        Path directory = Paths.get("src/IO_stream/JavaNIO_classes/Files/newCatalogCreatedByJava");
        Path path1 = Paths.get("src/IO_stream/JavaNIO_classes/Files/myFile.txt");
        Path path2 = Paths.get("src/IO_stream/JavaNIO_classes/Files/newCatalogCreatedByJava/myCopiedFile.txt");
        Path path3 = Paths.get("src/IO_stream/JavaNIO_classes/Files/newCatalogCreatedByJava/myMovedFile.txt");
        Path path4 = Paths.get("src/IO_stream/copy_pasteValues/someInputFile.txt");

        // Files.createDirectory() >>> tworzy pojedyczy katalog.
        // jesli bysmy chieli zrobic 2 katalogi trzeba uzyc meody createDirectories()
        try {
            System.out.println(Files.createDirectories(directory));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // copy() >> plytkie kopiowanie jesli np: kazemy skopiowac katalod, to pliki wewnatrz juz nie zostana skopiowane
        // musimy z path gdzie chcemy przenosic podac nazwe pliku. Jesli podamy inna to nazwa sie zmieni
        // zuca bledami w wielu sytuacjach

//        try {
//            Files.copy(path1, path2);
//            System.out.println("copy succesfull");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



        // metoda move() pozwala przeniesc plik z katalogu do katalogu
            // jesli taki katalog bedzie juz istnial tu zuci wyjatek

//        try {
//            Files.move(path1, path3);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



        // Metoda delete() - usuwa plik, zuca bledy jesli go nie ma
        // zwraca voida

//        try {
//            Files.delete(path2);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        // Metoda deleteIfExists() - usuwa plik jesli istnieja
        // zwraca boolean
        try {
            System.out.println(Files.deleteIfExists(path2));
        } catch (IOException e) {
            System.out.println("file doesnt exist");
            throw new RuntimeException(e);
        }


        //metoda readAllLines()
        // uzywamy do malych plikow bo moze wywolac out of memmory Error

        try {
            System.out.println(Files.readAllLines(path1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //isSameFile()  < sprawdza sciezke do pliku czy jest taka sama
        // jesli mamy twory w postaci
            // src/IO_stream/JavaNIO_classes/Files/myFile.txt
            // src/../src/IO_stream/JavaNIO_classes/Files/myFile.txt
            // to zuci wyjatkiem

        try {
            System.out.println(Files.isSameFile(path1, path4));
        } catch (IOException e) {
            System.err.println(e.getMessage() + "    this is not the same file");
        }


    }
}