public class ThreadEg2 {
    public static void main(String[] args) {
        // Creating and starting three separate Threads.Thread3 instances
        Thread3 thread3_1 = new Thread3();
        Thread3 thread3_2 = new Thread3();
        Thread3 thread3_3 = new Thread3();

        Thread t1 = new Thread(thread3_1);
        Thread t2 = new Thread(thread3_2);
        Thread t3 = new Thread(thread3_3);

        t1.start();
        t2.start();
        t3.start();

        // Creating and starting Threads.Thread1 instance
        Thread2 tt1 = new Thread2();
        Thread threadt1 = new Thread(tt1);
        threadt1.start();

        // Creating and starting two separate Threads.Thread2 instances
        Thread2 tt2 = new Thread2();
        Thread threadt2 = new Thread(tt2);
        Thread threadt22 = new Thread(tt2);

        threadt2.start();
        threadt22.start();
    }
}

class Thread3 implements Runnable {
    public void run() {
        System.out.println("From Threads.Thread3!");
        System.out.println("From Threads.Thread3!");
        System.out.println("From Threads.Thread3!");
        System.out.println("From Threads.Thread3!");
        System.out.println("From Threads.Thread3!");
    }
}

class Thread1 implements Runnable {
    public void run() {
        System.out.println("From ThreadRunnable1!");
        System.out.println("From ThreadRunnable1!");
    }
}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("From ThreadRunnable2!");
        System.out.println("From ThreadRunnable2!");
        System.out.println("From ThreadRunnable2!");
    }
}
