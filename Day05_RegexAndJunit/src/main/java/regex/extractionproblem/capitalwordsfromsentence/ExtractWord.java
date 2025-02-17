package regex.extractionproblem.capitalwordsfromsentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWord {
    public static void main(String[] args) {
        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "[A-Z]+[a-z]{1,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while(matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
