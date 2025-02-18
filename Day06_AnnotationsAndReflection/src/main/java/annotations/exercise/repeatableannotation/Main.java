package annotations.exercise.repeatableannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        TaskManager taskManager = new TaskManager();
        taskManager.processTask();

        Method method = TaskManager.class.getMethod("processTask");
        BugReports bugReports = method.getAnnotation(BugReports.class);

        if(bugReports != null) {
            for(BugReport report: bugReports.value()) {
                System.out.println("Bug: " + report.description());
            }
        }
    }
}
