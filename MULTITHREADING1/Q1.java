public class Q1 {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {
            System.out.println("Runnable thread is running.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runnable thread is done.");
        };
        Thread runnableThread = new Thread(runnable);
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread class thread is running.");
                Thread.sleep(2000);
                System.out.println("Thread class thread is done.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        runnableThread.start();
        thread.start();

        thread.join();
        runnableThread.join();
        System.out.println("All threads are completed.");
    }
}
