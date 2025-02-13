package com.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("B", 3);
        map2.put("C", 4);

        for(Map.Entry<String, Integer> entry:map2.entrySet()) {
            if(map1.containsKey(entry.getKey())) {
                int value = map1.get(entry.getKey()) + entry.getValue();
                map1.put(entry.getKey(), value);
            } else {
                map1.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println(map1);
    }
}
