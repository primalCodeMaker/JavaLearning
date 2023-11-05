package Part3.IO_Stream_Exercises.second;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SecondResolve2 {

    // scalone streamy z poprzedniego rozwiazania
    // ctrl + alt + n

    public static void main(String[] args) {

        Path rootPath = Paths.get("./src");
        String serchedWord = "zajavka";
        List<String> prohibitedExtension = List.of(".docx");

        printSpecificPaths(rootPath, serchedWord, prohibitedExtension);
    }

    private static void printSpecificPaths(Path rootPath, String serchedWord, List<String> prohibitedExtension) {
        try {
            Files.walk(rootPath)
                    .filter(Files::isRegularFile)
                    .filter(path -> !prohibitedExtension.contains(getPathExtension(path)))
                    .filter(path -> pathContains(path, serchedWord))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean pathContains(Path path, String serchedWord) {
        try {
            return Files.lines(path).anyMatch(word -> word.contains(serchedWord));
        } catch (IOException e) {
            System.err.println("Unable to check file: " + path
                    + " and word: " + serchedWord + "Message: " + e.getMessage());
            return false;
        }
    }

    private static String getPathExtension(Path path) {
        String fileName = path.getFileName().toString();
        int i = fileName.lastIndexOf('.');

        if (i == -1) {
            return fileName;
        }
        return fileName.substring(i);
    }
}
