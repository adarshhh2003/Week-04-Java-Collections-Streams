package annotations.intermediatelevel.maxlengthannotation;

public class Main {
    public static void main(String[] args) {
        try {
            User user1 = new User("ShortName");
            System.out.println("User created successfully");

            User user2 = new User("Thisisaverylongusername");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
