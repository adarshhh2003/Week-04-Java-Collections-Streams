package com.listinterface.removeduplicates;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int num: list) {
            if(!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 1, 2, 2, 3, 4);

        System.out.println("Before Removing Duplicates: " + list);
        list = removeDuplicates(list);
        System.out.println("After Removing Duplicates: " + list);
    }
}
