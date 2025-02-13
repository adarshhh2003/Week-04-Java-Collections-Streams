package com.countwordinfile;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/countwordinfile/file.txt";

        Map<String, Integer> wordCountMap = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Normalize text: convert to lowercase, remove punctuation
                line = line.toLowerCase().replaceAll("[^a-zA-Z ]", "");
                String[] words = line.split("\\s+"); // Split by whitespace

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                        totalWords++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Sort words by frequency in descending order
        List<Map.Entry<String, Integer>> sortedWords = wordCountMap.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(5)
                .collect(Collectors.toList());

        // Display results
        System.out.println("Total words: " + totalWords);
        System.out.println("Top 5 most frequent words:");
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
