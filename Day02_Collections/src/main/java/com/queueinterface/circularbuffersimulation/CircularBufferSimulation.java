package com.queueinterface.circularbuffersimulation;

public class CircularBufferSimulation {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        circularQueue.push(1);
        circularQueue.push(2);
        circularQueue.push(3);

        circularQueue.print();

        circularQueue.push(4);
        circularQueue.print();

        circularQueue.push(5);
        circularQueue.print();
    }
}
