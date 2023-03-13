import java.util.*;
import java.util.concurrent.*;

public class Q2 {
    public static void main(String[] args) throws InterruptedException {

        List<Runnable> tasks = new ArrayList<>();
        tasks.add(() -> System.out.println("Task 1"));
        tasks.add(() -> System.out.println("Task 2"));
        tasks.add(() -> System.out.println("Task 3"));

        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        executeTasks(executor1, tasks);

        ExecutorService executor2 = Executors.newCachedThreadPool();
        executeTasks(executor2, tasks);

        ExecutorService executor3 = Executors.newFixedThreadPool(2);
        executeTasks(executor3, tasks);

    }

    private static void executeTasks(ExecutorService executor, List<Runnable> tasks) throws InterruptedException {
        for (Runnable task : tasks) {
            executor.submit(task);
        }

        executor.shutdown();
    }
}
