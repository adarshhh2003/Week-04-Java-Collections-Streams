package reflection.advancedlevel.jsonrepresentation;

import java.lang.reflect.Field;

public class CustomObjectToJson {

    public static String toJson(Object obj) throws IllegalAccessException {
        // Use StringBuilder to construct the JSON string
        StringBuilder jsonString = new StringBuilder();

        // Start the JSON object
        jsonString.append("{");

        // Get the class of the object
        Class<?> clazz = obj.getClass();

        // Get all declared fields (including private fields)
        Field[] fields = clazz.getDeclaredFields();

        // Iterate through each field
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);  // Make private fields accessible

            // Get field name and value
            String fieldName = field.getName();
            Object fieldValue = field.get(obj);

            // Append field name and value to the JSON string
            jsonString.append("\"")
                    .append(fieldName)
                    .append("\": ")
                    .append(valueToJson(fieldValue));

            // If it's not the last field, add a comma
            if (i < fields.length - 1) {
                jsonString.append(", ");
            }
        }

        // End the JSON object
        jsonString.append("}");

        return jsonString.toString();
    }

    private static String valueToJson(Object value) throws IllegalAccessException{
        // Handle different types of values
        if (value == null) {
            return "null";
        }
        if (value instanceof String) {
            return "\"" + value + "\"";
        }
        if (value instanceof Number || value instanceof Boolean) {
            return value.toString();
        }

        // If the value is an object, recursively call toJson
        return toJson(value);
    }

    public static void main(String[] args) {
        try {
            Person person = new Person("Raj Kumar", 30);
            String json = toJson(person);
            System.out.println(json);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}