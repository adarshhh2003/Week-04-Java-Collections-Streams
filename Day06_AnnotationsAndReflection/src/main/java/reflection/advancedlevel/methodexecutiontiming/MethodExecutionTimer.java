package reflection.advancedlevel.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodExecutionTimer {
    public static void main(String[] args) {
        try {
            // Create an instance of the class whose method execution time we want to measure
            MyClass myClass = new MyClass();

            // Get the method to be measured by name (e.g., "sayHello")
            Method method = MyClass.class.getMethod("sayHello");

            // Measure the execution time of the method
            measureExecutionTime(myClass, method);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void measureExecutionTime(Object target, Method method) throws Exception {
        // Record the start time
        long startTime = System.nanoTime();

        // Invoke the method on the target object
        method.invoke(target);

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate and print the execution time
        long duration = endTime - startTime;
        System.out.println("Method " + method.getName() + " executed in " + duration + " nanoseconds.");
    }
}

class MyClass {
    public void sayHello() {
        // Simulate some processing
        System.out.println("Hello, world!");
    }
}