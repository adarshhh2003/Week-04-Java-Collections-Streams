package junit.basicjunittest.calculatorclass;

public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a , int b ){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a , int b) throws ArithmeticException{
//        if(a == 0){
//            throw new ArithmeticException("Division by zero is not allowed");
//        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(3, 4));
        System.out.println("Subtraction: " + subtract(4, 3));
        System.out.println("Multiply: " + multiply(3, 4));
        System.out.println("Divide: " + divide(4, 3));
    }
}
