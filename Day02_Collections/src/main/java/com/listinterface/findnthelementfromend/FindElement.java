package com.listinterface.findnthelementfromend;

import java.util.Collections;
import java.util.LinkedList;

public class FindElement {
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, 'A', 'B', 'C', 'D', 'E');
        int n=2;

        for(int i=1; i<n; i++) {
            linkedList.removeLast();
        }

        System.out.println("The n-th element from the end of the list is: " + linkedList.getLast());
    }
}
