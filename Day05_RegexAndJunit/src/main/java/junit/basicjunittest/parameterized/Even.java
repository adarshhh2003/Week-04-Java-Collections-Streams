package junit.basicjunittest.parameterized;

public class Even {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("isEven: "  + isEven(7));
    }
}