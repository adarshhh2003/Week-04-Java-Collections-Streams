package annotations.exercise.repeatableannotation;

public class TaskManager {
    @BugReport(description = "Null pointer exception under certain conditions")
    @BugReport(description = "Performance issue on large dataset")
    public void processTask() {
        System.out.println("Processing Task....");
    }
}
