package com.queueinterface.circularbuffersimulation;

public class CircularQueue {
    private int[] arr;
    private int size;
    private int index;
    private int dummySize;
    private int front;

    public CircularQueue(int size) {
        arr = new int[size];
        this.size = size;
        this.index = 0;
        this.dummySize = 0;
        this.front = 0;
    }

    public void push(int value) {
        arr[index] = value;
        index = (index+1) % size;

        if(dummySize<size) {
            dummySize++;
        } else {
            front = (front+1) % size;
        }
    }

    public void print() {
        for(int i=0; i<size; i++) {
            System.out.print(arr[(i+front)%size] + " ");
        }
        System.out.println();
    }
}
