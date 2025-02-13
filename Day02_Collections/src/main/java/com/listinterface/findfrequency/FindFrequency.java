package com.listinterface.findfrequency;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        for(int i=0; i<list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);
        }

        for(Map.Entry<String, Integer> it: map.entrySet()) {
            System.out.println("Key: " + it.getKey() + " Value: " + it.getValue());
        }
    }
}
