package annotations.advancedlevel.jsondfieldannotation;

public class Main {
    public static void main(String[] args) {
        User user = new User("Uday", 25);
        System.out.println(user.toJson()); // Should print JSON representation
    }
}