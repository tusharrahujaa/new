import java.util.concurrent.*;

public class Q4 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = new Callable<Integer>() {

            public Integer call() throws Exception {
                int a = 10;
                int b = 20;
                return a * b;
            }
        };
        Future<Integer> future = executor.submit(callable);

        int result = future.get();
        System.out.println(result);
        executor.shutdown();
    }

}
