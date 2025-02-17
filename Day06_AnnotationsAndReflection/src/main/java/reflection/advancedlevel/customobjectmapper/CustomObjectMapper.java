package reflection.advancedlevel.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();

        for(Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);

                if(field.getType().isAssignableFrom(fieldValue.getClass())) {
                    field.set(obj, fieldValue);
                } else {
                    convertAndSetField(obj, field, fieldValue);
                }
            } catch (NoSuchFieldException e) {
                System.out.println("Field not found: " + fieldName);
            } catch (IllegalAccessException e) {
                System.out.println("Unable to set the value for field: " + fieldName);
            } catch (Exception e) {
                System.out.println("Error setting field " + fieldName + e.getMessage());
            }
        }

        return obj;
    }

    private static void convertAndSetField(Object obj, Field field, Object fieldValue) throws IllegalAccessException {
        // Example: handle String to int conversion
        if (field.getType().equals(int.class) && fieldValue instanceof String) {
            field.set(obj, Integer.parseInt((String) fieldValue));
        } else {
            throw new IllegalArgumentException("Cannot convert type for field " + field.getName());
        }
    }

    public static void main(String[] args) {
        try {
            Map<String, Object> properties = Map.of("name", "Raj Kumar", "age", "30");
            Person person = toObject(Person.class, properties);
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Name: " + name + " age: " + age;
    }
}