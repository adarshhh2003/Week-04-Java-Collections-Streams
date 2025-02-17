package regex.replacemodifystring.badwordinsentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";

        text = text.replaceAll("damn", "****");
        text = text.replaceAll("stupid", "****");
        System.out.println(text);
    }
}
