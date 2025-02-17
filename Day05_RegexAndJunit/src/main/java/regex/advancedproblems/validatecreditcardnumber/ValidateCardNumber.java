package regex.advancedproblems.validatecreditcardnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCardNumber {
    public static void validateVisa(String visaRegex, String visa) {
        Pattern pattern = Pattern.compile(visaRegex);
        Matcher matcher = pattern.matcher(visa);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void validateMasterCard(String masterCardRegex, String masterCard) {
        Pattern pattern = Pattern.compile(masterCardRegex);
        Matcher matcher = pattern.matcher(masterCard);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String visaRegex = "4+[0-9]{15}";
        String masterCardRegex = "5+[0-9]{15}";
        String visa = "4431011111111111";
        String masterCard = "5711111111111145";

        validateVisa(visaRegex, visa);
        validateMasterCard(masterCardRegex, masterCard);
    }
}
