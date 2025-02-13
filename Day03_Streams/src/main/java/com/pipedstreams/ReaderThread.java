package com.pipedstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(pis))) {
            String receivedMessage;
            while ((receivedMessage = reader.readLine()) != null) {
                System.out.println("Reader: Received -> " + receivedMessage);
            }
        } catch (IOException e) {
            System.err.println("Reader error: " + e.getMessage());
        }
    }
}
