package regex.advancedproblems.extractcurrencyvalue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValue {
    public static void main(String[] args) {
        String regex = "\\$?\\d+(\\.\\d{2})?";
        String text = "The price is $45.99, and the discount is 10.50.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
