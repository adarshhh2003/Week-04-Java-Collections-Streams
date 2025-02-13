package com.mapinterface.wordfrequencycounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void countWordFrequency(Map<String, Integer> map, String filePath) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line= bufferedReader.readLine())!=null) {
                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
                String[] words = line.split("\\s+");

                for(String word:words) {
                    if(!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0)+1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String filePath = "src/main/java/com/mapinterface/wordfrequencycounter/file.txt";
        countWordFrequency(map, filePath);

        System.out.println(map);
    }
}
