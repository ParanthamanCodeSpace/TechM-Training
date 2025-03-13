import java.util.ArrayList;
import java.util.List;

public class MultiThreadPrimeSum {
    private static final int LIMIT = 100; // Change this to any limit
    private static final int NUM_THREADS = 4; // Number of threads
    private static int totalSum = 0; // Shared sum variable
    private static final Object lock = new Object(); // Lock for synchronization

    public static void main(String[] args) {
        int rangeSize = LIMIT / NUM_THREADS;
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * rangeSize + 1;
            int end = (i == NUM_THREADS - 1) ? LIMIT : (start + rangeSize - 1);
            Thread thread = new Thread(new PrimeSumTask(start, end));
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join(); // Wait for all threads to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers up to " + LIMIT + " is: " + totalSum);
    }

    // Runnable task to compute prime sum in a range
    static class PrimeSumTask implements Runnable {
        private int start, end;

        public PrimeSumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }

            // Add to totalSum safely using synchronization
            synchronized (lock) {
                totalSum += sum;
            }
        }

        // Check if a number is prime
        private boolean isPrime(int num) {
            if (num < 2) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }
}
