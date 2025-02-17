package reflection.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperation {
    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            System.out.println("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            scanner.close();

            Class mathClass = MathOperation.class;

            Object mathInstance =   mathClass.getDeclaredConstructor().newInstance();

            Method method = mathClass.getMethod(methodName, int.class, int.class);

            int result = (int) method.invoke(mathInstance, num1, num2);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
