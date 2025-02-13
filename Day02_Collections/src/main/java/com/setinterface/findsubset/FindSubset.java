package com.setinterface.findsubset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindSubset {
    public static int findSubset(Set<Integer> set1, Set<Integer> set2) {
        if(set1.size() <= set2.size()) {
            for (int num:set1) {
                if (!set2.contains(num)) {
                    return 0;
                }
            }

            return 1;
        }

        for(int num:set2) {
            if(!set1.contains(num)) {
                return 0;
            }
        }

        return 2;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 2, 3);

        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, 1, 2, 3, 4);

        int checkSubset = findSubset(set1, set2);

        if(checkSubset==1) {
            System.out.println("set1 is a subset of set2");
        } else if(checkSubset==2) {
            System.out.println("set2 is a subset of set1");
        } else {
            System.out.println("No subset available in set1 and set2");
        }
    }
}
