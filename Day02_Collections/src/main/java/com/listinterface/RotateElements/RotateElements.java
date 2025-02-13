package com.listinterface.RotateElements;

import java.util.*;

public class RotateElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 20, 30, 40, 50);
        int k = 2;

        System.out.println("Before Rotate ArrayList: " + list);

        for(int i=0; i<k; i++) {
            int temp = list.remove(0);
            list.add(temp);
        }

        System.out.println("After Rotate ArrayList: " + list);
    }
}
