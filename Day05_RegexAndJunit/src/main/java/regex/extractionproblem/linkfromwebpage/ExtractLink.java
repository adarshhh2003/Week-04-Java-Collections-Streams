package regex.extractionproblem.linkfromwebpage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    public static void main(String[] args) {
        String webpage = "Visit https://www.google.com and http://example.org for more info.";
        String regex = "https?://(www.)?+[a-zA-Z0-9]{1,}+.[a-z]{2,3}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(webpage);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
