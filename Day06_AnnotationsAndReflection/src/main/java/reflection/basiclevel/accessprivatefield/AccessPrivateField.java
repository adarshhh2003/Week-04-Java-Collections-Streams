package reflection.basiclevel.accessprivatefield;

import java.io.File;
import java.lang.reflect.Field;

class Person {
    private int age = 10;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);

            // Access private field using reflection
            Field ageFiled = Person.class.getDeclaredField("age");
            ageFiled.setAccessible(true);

            // Get and print the original value
            System.out.println("Original Age: " + ageFiled.get(person));

            // Modify the private field value
            ageFiled.set(person, 30);

            // Get and print modified age
            System.out.println("Modified Age: " + ageFiled.get(person));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
