package junit.basicjunittest.teststringutilitymethods;

public class StringUtils {

    // Returns the reverse of a given string
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Returns true if the string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    // Converts a string to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println("Reverse: " + reverse("Adarsh"));
        System.out.println("isPallindrome: " + isPalindrome("Adarsh"));
        System.out.println("toUpperCase: " + toUpperCase("Adarsh"));
    }
}