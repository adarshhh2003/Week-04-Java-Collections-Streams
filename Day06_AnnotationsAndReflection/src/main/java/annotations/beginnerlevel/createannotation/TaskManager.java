package annotations.beginnerlevel.createannotation;

public class TaskManager {
    @ImportantMethod()
    public void criticalTask() {
        System.out.println("Executing a critical task...");
    }

    @ImportantMethod(level = "Medium")
    public void secondaryTask() {
        System.out.println("Executing a secondary task...");
    }
}
