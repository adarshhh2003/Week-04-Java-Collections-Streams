package annotations.intermediatelevel.logexecutionttimeannotation;

public class PerformanceTest {
    @LogExecutionTime
    public void longRunningTask() {
        long start = System.nanoTime();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();

        System.out.println("Execution time: " + (end-start)/1000000 + "ms");
    }

    @LogExecutionTime
    public void quickTask() {
        long start = System.nanoTime();

        int sum = 0;
        for(int i=0; i<1000; i++) {
            sum += i;
        }

        long end = System.nanoTime();

        System.out.println("Execution time: " + (end-start)/1000000 + "ms");
    }
}
