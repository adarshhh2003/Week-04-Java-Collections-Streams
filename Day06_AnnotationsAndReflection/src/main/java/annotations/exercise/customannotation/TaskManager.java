package annotations.exercise.customannotation;

public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Raaj kumar")
    public void completeTask() {
        System.out.println("Task completed.");
    }
}
