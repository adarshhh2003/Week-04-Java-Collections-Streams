package com.mapinterface.findkey;

import java.util.HashMap;
import java.util.Map;

public class FindKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        int max = 0;
        String result = "";

        for(Map.Entry<String, Integer> entry:map.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println("The key with highest value is: " + result);
    }
}
