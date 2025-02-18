package annotations.beginnerlevel.todoannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.criticalTask();
        taskManager.secondaryTask();
        taskManager.remainingTask();
        System.out.println("-----------------");

        Method[] methods = TaskManager.class.getDeclaredMethods();
        for(Method method : methods) {
            Todo todo = method.getAnnotation(Todo.class);
            System.out.println("Pending task: " + todo.task());
            System.out.println("Assigned to: " + todo.assignedTo());
            System.out.println("Priority: " + todo.priority());
            System.out.println("-----------------------");
        }
    }
}
