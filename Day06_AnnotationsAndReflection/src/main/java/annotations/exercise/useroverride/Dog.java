package annotations.exercise.useroverride;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog make sound: ");
    }
}
