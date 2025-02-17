package regex.advancedproblems.findrepeatingwords;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatedWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        String regex = "\\b\\w+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text.toLowerCase());

        Map<String, Integer> map = new HashMap<>();

        while (matcher.find()) {
            String word = matcher.group();
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for(Map.Entry<String, Integer> entry:map.entrySet()) {
            if(entry.getValue()>1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
