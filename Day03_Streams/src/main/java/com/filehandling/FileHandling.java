package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String sourceFile = "src/main/java/com/filehandling/sourcefile.txt";
        String destinationFile = "src/main/java/com/filehandling/destinationfile.txt";

        try(FileInputStream fileInputStream = new FileInputStream(sourceFile);
                FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)) {


            int byteRead;

            while((byteRead=fileInputStream.read()) != -1) {
                fileOutputStream.write( byteRead);
            }

            System.out.println("File Copies Successfully from " + sourceFile + " to " + destinationFile);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
