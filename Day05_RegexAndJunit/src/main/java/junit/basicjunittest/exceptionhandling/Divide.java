package junit.basicjunittest.exceptionhandling;

public class Divide {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program Finished");
    }
}