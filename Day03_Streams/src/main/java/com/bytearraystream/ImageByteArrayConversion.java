package com.bytearraystream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageByteArrayConversion {
    public static void main(String[] args) {
        String inputImagePath = "src/main/java/com/bytearraystream/Screenshot 2025-01-22 150309.png";
        String outputImagePath = "src/main/java/com/bytearraystream/Screenshot 2025-01-22 154204.png";

        try {
            byte[] imageBytes = convertImageToByteArray(inputImagePath);
            System.out.println("Image successfully convertes to byte array");

            convertByteArrayToImage(imageBytes, outputImagePath);
            System.out.println("Byte array successfully writen to the image path");

            if(compareFiles(inputImagePath, outputImagePath)) {
                System.out.println("The original and copied images are identical");
            } else {
                System.out.println("The original and copied images differs from each other");
            }
        } catch (IOException e) {
            System.out.println("Error processing the image: " + e.getMessage());
        }
    }

    public static byte[] convertImageToByteArray(String inputImagePath) throws IOException {

        try(FileInputStream fis = new FileInputStream(inputImagePath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int byteRead;
            while((byteRead=fis.read(buffer)) != -1) {
                baos.write(buffer, 0, byteRead);
            }

            return baos.toByteArray();
        }
    }

    public static void convertByteArrayToImage(byte[] imageBytes, String outputImagePath) {

        try(ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream(outputImagePath)) {

            byte[] buffer = new byte[1024];
            int byteRead;
            while((byteRead=bais.read(buffer)) != -1) {
                fos.write(buffer, 0, byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error convert byte array to image: " + e.getMessage());
        }
    }

    public static boolean compareFiles(String inputImagePath, String outputImagePath) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(new File(inputImagePath).toPath());
        byte[] file2Bytes = Files.readAllBytes(new File(outputImagePath).toPath());

        return Arrays.equals(file1Bytes, file2Bytes);
    }
}
