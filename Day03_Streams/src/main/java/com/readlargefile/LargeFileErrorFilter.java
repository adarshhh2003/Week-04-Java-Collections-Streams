package com.readlargefile;

import java.io.*;

public class LargeFileErrorFilter {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/readlargefile/file.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line); // Print only lines containing "error"
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
