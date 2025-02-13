package com.queueinterface.reverseaqueue;

import java.util.*;

public class ReverseAQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        if(queue.isEmpty()) {
            return;
        }

        int temp = queue.poll();

        reverseQueue(queue);

        queue.add(temp);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Collections.addAll(queue, 10, 20, 30);

        System.out.println("Before Reverse: " + queue);
        reverseQueue(queue);
        System.out.println("After Reverse: " + queue);
    }
}
