package com.setinterface.symmetricdifference;

import java.util.*;

public class SymmetricDifference {
    public static void symmetricDifference(Set<Integer> set1, Set<Integer> set2, List<Integer> result) {
        for(int num:set1) {
            if(!set2.contains(num)) {
                result.add(num);
            }
        }

        for(int num:set2) {
            if(!set1.contains(num)) {
                result.add(num);
            }
        }
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 1, 2, 3);

        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, 3, 4, 5);

        List<Integer> result = new ArrayList<>();

        symmetricDifference(set1, set2, result);

        System.out.println("The symmetric difference of set1: " + set1 + " and set2: " + set2 + " is: " + result);
    }
}
