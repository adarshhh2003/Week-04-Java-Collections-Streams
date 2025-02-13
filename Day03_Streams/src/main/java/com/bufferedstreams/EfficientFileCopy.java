package com.bufferedstreams;

import java.io.*;

public class EfficientFileCopy {
    public void writeToFile(String sourceFile) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(sourceFile))) {

            String temp = "Hello my name is Java ";

            for(int i=0; i<1000; i++) {
                bufferedWriter.write(temp);
                bufferedWriter.flush();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void timeByFileReader(String sourceFile, String destinationFile) {
        long start = System.nanoTime();

        try(FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteRead;
            while((byteRead=fis.read()) != -1) {
                fos.write(byteRead);
                fos.flush();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        long end = System.nanoTime();
        long difference = end-start;

        System.out.println("Time by FileInputStream and FileOutputStream is: " + difference/1000000.0);
    }

    public void timeByBufferedReader(String sourceFile, String destinationFile) {
        long start = System.nanoTime();

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            int byteRead;
            while((byteRead=bis.read()) != -1) {
                bos.write(byteRead);
                bos.flush();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        long end = System.nanoTime();
        long difference = end-start;

        System.out.println("Time by BufferedInputStream and BufferedOutputStream is: " + difference/1000000.0);
    }
}
