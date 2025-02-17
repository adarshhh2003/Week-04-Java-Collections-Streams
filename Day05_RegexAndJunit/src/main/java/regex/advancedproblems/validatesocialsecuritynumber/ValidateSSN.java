package regex.advancedproblems.validatesocialsecuritynumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] args) {
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        String text = "My SSN is 123-45-6789.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
