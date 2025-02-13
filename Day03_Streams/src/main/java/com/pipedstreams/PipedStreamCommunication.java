package com.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamCommunication {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // Connect streams

            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            writer.start();
            reader.start();

            writer.join(); // Ensure writer completes first
            reader.join(); // Wait for reader to complete

        } catch (IOException | InterruptedException e) {
            System.err.println("Error in main: " + e.getMessage());
        }
    }
}