package regex.basicregexproblem.validateusername;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}$";
        String username = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        boolean ans = matcher.matches();

        System.out.println("Valid username: " + ans);
    }
}
