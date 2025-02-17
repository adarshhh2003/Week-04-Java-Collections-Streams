package regex.replacemodifystring.replacemultiplespaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String text = "This  is  an example with multiple spaces.";

//        This will also do the same thing
//        String result = text.replaceAll("\\s+", " ");
//        System.out.println("Direct replace: " + result);

        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println( matcher.replaceAll(" "));
        }
    }
}
