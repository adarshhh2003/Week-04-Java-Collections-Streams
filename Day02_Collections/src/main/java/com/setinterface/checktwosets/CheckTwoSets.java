package com.setinterface.checktwosets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CheckTwoSets {
    public static boolean checkTwoSets(Set<Integer> set1, Set<Integer> set2) {
        if(set1.size()==set2.size()) {
           for(int num: set1) {
               if(!set2.contains(num)) {
                   return false;
               } else {
                   set2.remove(num);
               }
           }
        } else {
            return false;
        }
        System.out.println(set2);
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 1, 2, 3);

        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, 3, 2, 1);

        boolean checkEqual = checkTwoSets(set1, set2);

        System.out.println("Set1 and Set2 are equal: " + checkEqual);
    }
}
