package junit.advancedjunit.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    public static String formatDate(String inputDate) {
        try {
            // Define the input and output date formats
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Parse the input date and format it to the desired output
            LocalDate date = LocalDate.parse(inputDate, inputFormatter);
            return date.format(outputFormatter);
        } catch (DateTimeParseException e) {
            // Handle invalid date format
            return "Invalid date format";
        }
    }

    public static void main(String[] args) {
        String inputDate = "2025-01-12";

        System.out.println("Format Date: " + formatDate(inputDate));
    }
}

