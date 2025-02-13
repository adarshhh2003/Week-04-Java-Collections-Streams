package com.bufferedstreams;

public class BufferedStreams {
    public static void main(String[] args) {
        String sourceFile = "src/main/java/com/bufferedstreams/sourceFile.txt";
        String destinationFile = "src/main/java/com/bufferedstreams/destinationfile.txt";

       EfficientFileCopy file = new EfficientFileCopy();
       file.writeToFile(sourceFile);
       file.timeByFileReader(sourceFile, destinationFile);
       file.timeByBufferedReader(sourceFile, destinationFile);
    }
}
