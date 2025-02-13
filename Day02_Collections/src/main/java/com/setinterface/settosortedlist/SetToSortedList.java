package com.setinterface.settosortedlist;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, 13, 23, 5, 3, 9, 1);

        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);

        System.out.println("HashSet: " + set);
        System.out.println("Sorted List: " + sortedList);
    }
}
