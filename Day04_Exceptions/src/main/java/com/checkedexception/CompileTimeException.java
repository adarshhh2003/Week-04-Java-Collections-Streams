package com.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {
    public static void checkException(String filePath) {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while((line=br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "src/main/java/com/checkedexception/file.txt";

        checkException(filePath);
    }
}
