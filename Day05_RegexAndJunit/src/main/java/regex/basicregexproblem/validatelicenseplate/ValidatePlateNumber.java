package regex.basicregexproblem.validatelicenseplate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePlateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-Z]{2}+[0-9]{4}$";
        String plateNumber = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(plateNumber);
        boolean ans = matcher.matches();

        System.out.println(plateNumber + " Valid: " + ans);
    }
}
