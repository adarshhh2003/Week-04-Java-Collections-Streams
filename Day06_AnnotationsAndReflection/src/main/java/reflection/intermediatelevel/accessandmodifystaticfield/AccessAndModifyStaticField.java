package reflection.intermediatelevel.accessandmodifystaticfield;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

    public static String getApiKey() {
        return API_KEY;
    }
}

public class AccessAndModifyStaticField {
    public static void main(String[] args) {
        try {
            Class<?> configClass = Configuration.class;

            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            apiKeyField.setAccessible(true);

            System.out.println("Original API_KEY: " + apiKeyField.getName());

            apiKeyField.set(null, "NEW_SECURE_KEY");

            System.out.println("Modified API_KEY: " + Configuration.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
