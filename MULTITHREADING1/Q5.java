import java.util.concurrent.locks.*;

public class Q5 {
    static int counter = 0;
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                try {
                    for (int i = 1; i <= 10; i++) {
                        Q5.counter++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                try {
                    for (int i = 1; i <= 10; i++) {
                        Q5.counter++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Counter is : " + Q5.counter);
    }
}