package com.listinterface.reversealist;

import java.util.*;

public class ReverseAList {
    public static void reverseArrayList(List<Integer> arrayList) {
        int start = 0;
        int end = arrayList.size()-1;

        while(start<end) {
            int temp = arrayList.get(start);
            arrayList.set(start, arrayList.get(end));
            arrayList.set(end, temp);
            start++;
            end--;
        }
    }

    public static void reverseLinkedList(LinkedList<Integer> linkedList) {
        int end = linkedList.size()-1;
        int start = 0;

        while(start<end) {
            int temp1 = linkedList.get(start);
            int temp2 = linkedList.get(end);
            linkedList.set(start, temp2);
            linkedList.set(end, temp1);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Before Reverse ArrayList" + arrayList);
        reverseArrayList(arrayList);
        System.out.println("After Reverse ArrayList" + arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Before Reverse LinkedList " + linkedList);
        reverseLinkedList(linkedList);
        System.out.println("After Reverse LinkedList " + linkedList);
    }
}
