package reflection.basiclevel.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInspector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fully qualified name: ");
        String className = scanner.nextLine();
        scanner.close();

        try {

            Class<?> cls = Class.forName(className);
            System.out.println("Class: " + cls.getName());

            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            System.out.println("\nConstructors: ");
            for(Constructor<?> constructor:constructors) {
                System.out.println(constructor);
            }

            Field[] fields = cls.getDeclaredFields();
            System.out.println("\nFields: ");
            for(Field field:fields) {
                System.out.println(field);
            }

            Method[] methods = cls.getDeclaredMethods();
            System.out.println("\nMethods: ");
            for(Method method:methods) {
                System.out.println(method);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found" + e.getMessage());
        }
    }
}
