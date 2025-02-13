package com.setinterface.unionandintersection;

import java.util.*;

public class UnionAndIntersection {
    public static void unionAndIntersection(Set<Integer> set1, Set<Integer> set2, List<Integer> union, List<Integer> intersection) {
        for(int num:set1) {
            if(!set2.contains(num)) {
                union.add(num);
            } else {
                union.add(num);
                intersection.add(num);
            }
        }

        for(int num:set2) {
            if(!set1.contains(num)) {
                union.add(num);
            }
        }
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 1, 2, 3);

        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, 3, 4, 5);

        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();

        unionAndIntersection(set1, set2, union, intersection);

        System.out.println("Union of set1: " + set1 + " and set2: " + set2 + " is: " + union + " and itersection is: " + intersection);
    }
}
