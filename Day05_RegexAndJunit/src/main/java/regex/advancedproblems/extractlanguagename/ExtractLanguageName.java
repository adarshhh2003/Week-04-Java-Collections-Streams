package regex.advancedproblems.extractlanguagename;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguageName {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
