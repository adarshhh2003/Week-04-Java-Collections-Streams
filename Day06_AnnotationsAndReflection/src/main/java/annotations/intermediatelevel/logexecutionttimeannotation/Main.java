package annotations.intermediatelevel.logexecutionttimeannotation;

public class Main {
    public static void main(String[] args) {
        PerformanceTest test = new PerformanceTest();

        test.longRunningTask();
        test.quickTask();
    }
}
