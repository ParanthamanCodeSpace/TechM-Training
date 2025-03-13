public class EvenOddThread {
    public static void main(String[] args) {
        // Creating and starting the Even Number Thread
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100); // Adding delay for better output visibility
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Creating and starting the Odd Number Thread
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100); // Adding delay for better output visibility
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
