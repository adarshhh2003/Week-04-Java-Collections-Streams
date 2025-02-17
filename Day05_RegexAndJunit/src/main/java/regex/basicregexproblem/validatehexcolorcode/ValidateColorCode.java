package regex.basicregexproblem.validatehexcolorcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateColorCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[#]{1}[a-fA-F0-9]{6}$";
        String hexColor = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hexColor);
        boolean ans = matcher.matches();

        if(ans) {
            System.out.println(hexColor + " is valid hexcolor");
        } else {
            System.out.println(hexColor + " not valid hexcolor");
        }
    }
}
