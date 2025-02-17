package junit.basicjunittest.filehandlingmethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {

    // Writes content to a file
    public static void writeToFile(String filename, String content) throws IOException {
        Path path = Paths.get(filename);
        Files.write(path, content.getBytes());
    }

    // Reads content from a file
    public static String readFromFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        return new String(Files.readAllBytes(path));
    }

    public static void main(String[] args) {
        String filename = "src/main/java/junit/basicjunittest/testfilehandlingmethod/file.txt";
        String content = "My name is Adarsh Patel";

        try {

            writeToFile(filename, content);
            readFromFile(filename);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}