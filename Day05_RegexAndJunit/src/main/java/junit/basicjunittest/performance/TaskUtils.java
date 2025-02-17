package junit.basicjunittest.performance;

public class TaskUtils {

    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Task completed";
    }

    public static void main(String[] args) {
        System.out.println(longRunningTask());
    }
}