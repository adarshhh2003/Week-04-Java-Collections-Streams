package annotations.beginnerlevel.todoannotation;

public class TaskManager {
    @Todo(task = "Do critical task", assignedTo = "Raaj Kumar", priority = "High")
    public void criticalTask() {
        System.out.println("Executing critical task...");
    }

    @Todo(task = "Do secondary task", assignedTo = "Udit Kumar")
    public void secondaryTask() {
        System.out.println("Executing secondary task...");
    }

    @Todo(task = "Do remaining task", assignedTo = "Akash Kumar", priority = "Low")
    public void remainingTask() {
        System.out.println("Executing remaining task...");
    }
}
