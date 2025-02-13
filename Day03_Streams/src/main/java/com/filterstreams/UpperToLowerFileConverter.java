package com.filterstreams;

import java.io.*;

public class UpperToLowerFileConverter {
    public static void main(String[] args) {
        String inputFile = "src/main/java/com/filterstreams/input.txt";
        String outputFile = "src/main/java/com/filterstreams/output.txt";

        convertUppercaseToLowercase(inputFile, outputFile);
    }

    public static void convertUppercaseToLowercase(String inputFile, String outputFile) {

        try(FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(outputFile);
            BufferedWriter bw = new BufferedWriter(fw)) {

            String line;
            while((line=br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }

            System.out.println("Conversion complete check the output file.");
        } catch (FileNotFoundException e) {
            System.out.println("Error file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }
}
