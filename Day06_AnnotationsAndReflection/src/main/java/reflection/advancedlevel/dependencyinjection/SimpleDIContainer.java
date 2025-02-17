package reflection.advancedlevel.dependencyinjection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SimpleDIContainer {

    // Map to store registered classes and their instances
    private Map<Class<?>, Object> container = new HashMap<>();

    // Register a class with its instance
    public <T> void register(Class<T> clazz, T instance) {
        container.put(clazz, instance);
    }

    // Resolve and inject dependencies into the target object
    public void inject(Object target) throws IllegalAccessException {
        // Get all fields of the target class
        Field[] fields = target.getClass().getDeclaredFields();

        // Iterate over fields to find the ones annotated with @Inject
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                // Make the field accessible
                field.setAccessible(true);

                // Get the type of the field
                Class<?> fieldType = field.getType();

                // Check if the container has an instance of the required type
                if (container.containsKey(fieldType)) {
                    // Inject the instance of the required type into the field
                    field.set(target, container.get(fieldType));
                } else {
                    throw new RuntimeException("No registered instance found for " + fieldType.getName());
                }
            }
        }
    }
}