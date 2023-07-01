package OutsideFiles.FileClass;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file1 = new File("notepad.txt");
        File file2 = new File("./src/OutsideFiles/FileClass/nestedFile.txt");
        File file3 = new File("./src/OutsideFiles/FileClass/doesntExistFile.txt");
        File catalog = new File("./src/OutsideFiles/FileClass");


        System.out.println(file1.exists());
        System.out.println(file2.exists());
        System.out.println(file3.exists() + "\n");

        if (file1.isFile()) {
            System.out.println(file1.getAbsolutePath());
            System.out.println(file1.length());
        }

        System.out.println("\n" + "file1.getParent: " + file1.getParent());
        System.out.println("file2.getParent: " + file2.getParent() + "\n");

        if (catalog.isDirectory()) {
            for (File element : catalog.listFiles()) {
                System.out.println("elements in folder: " + element);
            }
        }
        System.out.println("\n" + file2.lastModified());

        // tu robimy nowy katalog
        File newCatalogCreatedbyJava = new File("./src/OutsideFiles/FileClass/CatalogCreatedByJAva/secondOne");
        newCatalogCreatedbyJava.mkdirs(); // <<< bez tego katalog by sie nie zrobil
        // jesli robimy 1 katalog bez zagniezdzen to mozna uzyc metody .mkdir

        // tu robimy nowy plik
        File newFileCreated = new File("newFileCreated.txt");
        newFileCreated.createNewFile(); // <<< bez tego plik by sie nie zrobil
        // metoda .createNewFile() ma do obslugi IOexception

    }
}
