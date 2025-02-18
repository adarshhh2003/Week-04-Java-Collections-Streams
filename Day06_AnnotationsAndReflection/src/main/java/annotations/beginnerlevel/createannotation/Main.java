package annotations.beginnerlevel.createannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        TaskManager taskManager = new TaskManager();
        taskManager.criticalTask();
        taskManager.secondaryTask();

        // Retrieve annotation details using Reflection API
        Method[] methods = TaskManager.class.getDeclaredMethods();
        for(Method method : methods) {
            ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);
            System.out.println("Important Method: " + method.getName() + ", level: " + importantMethod.level());
        }
    }
}
