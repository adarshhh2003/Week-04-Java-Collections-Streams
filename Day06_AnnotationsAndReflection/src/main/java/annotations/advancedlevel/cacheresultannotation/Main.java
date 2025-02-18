package annotations.advancedlevel.cacheresultannotation;

public class Main {
    public static void main(String[] args) {
        ExpensiveComputation computation = new ExpensiveComputation();
        System.out.println("Factorial of 5: " + computation.computeFactorial(5));
        System.out.println("Factorial of 5 (cached): " + computation.computeFactorial(5));
        System.out.println("Factorial of 6: " + computation.computeFactorial(6));
    }
}