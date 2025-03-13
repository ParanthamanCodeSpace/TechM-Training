public class ThreadCreation {
    public static  void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}
class Thread1 extends Thread{
    public void run(){
        System.out.println("From Thread1");
        System.out.println("From Thread1");
        System.out.println("From Thread1");
    }
}
