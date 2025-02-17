package reflection.basiclevel.dynamicallycreateobject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public String getName() {
        return name;
    }
}

public class DynamicallyCreateObject {
    public static void main(String[] args) {
        try {

            Class<?> studentClass = Class.forName("reflection.basiclevel.dynamicallycreateobject.Student");

            Constructor<?> constructor = studentClass.getDeclaredConstructor();

            Object studentInstance = constructor.newInstance();

            Method getNameMethod = studentClass.getMethod("getName");
            String name = (String) getNameMethod.invoke(studentInstance);

            System.out.println("Student Name: " + name);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
