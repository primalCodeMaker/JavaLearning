package Part3.IO_Stream_Exercises.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewResolveWalksMethod {

    public static void main(String[] args) {

        Path rootPath = Paths.get("./src");
        String fileFinder = "java";

        getAllPaths2(rootPath, fileFinder);
    }

    // zwraca calego streama
    private static void getAllPaths(Path rootPath, String fileFinder) {
        try {
            Files.walk(rootPath).forEach(path -> System.out.println(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void getAllPaths2(Path rootPath, String fileFinder) {
        try {
            Files.walk(rootPath)
                    .filter(p -> Files.isRegularFile(p) && isFileSpecificExtension(fileFinder, p))
                    .forEach(p -> System.out.println(p));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        private static boolean isFileSpecificExtension(String fileFinder, Path path) {
            String[] split = path.getFileName().toString().split("\\.");
            if (split.length != 2) {
                return false;
            }
            return fileFinder.equals(split[1]);
        }

    }


