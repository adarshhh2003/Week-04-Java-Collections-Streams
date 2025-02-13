package com.pipedstreams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(pos))) {
            String[] messages = {
                    "Hello, Reader!",
                    "This is a message from WriterThread.",
                    "Piped Streams allow inter-thread communication.",
                    "End of messages."
            };

            for (String msg : messages) {
                writer.write(msg);
                writer.newLine(); // Ensures proper line separation
                writer.flush();   // Forces data to be written immediately
                System.out.println("Writer: Sent -> " + msg);
                Thread.sleep(1000); // Simulate delay
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Writer error: " + e.getMessage());
        }
    }
}