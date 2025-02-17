package regex.extractionproblem.emailaddressfromtext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[a-zA-Z0-9_.%$+-]+@([a-z])+\\.([a-z]{3})";
        String text = "Contact us at support@example.com and info@company.org";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
