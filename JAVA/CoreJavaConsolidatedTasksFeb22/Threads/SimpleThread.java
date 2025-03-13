public class SimpleThread extends Thread {
    public void run() {
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        // Creating and starting the thread
        SimpleThread thread = new SimpleThread();
        thread.start();
    }
}
