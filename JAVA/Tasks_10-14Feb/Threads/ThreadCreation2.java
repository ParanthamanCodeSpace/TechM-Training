public class ThreadCreation2 {
    public static void main(String[] args) {
        Thread2 tc1 = new Thread2();
        Thread t1=new Thread(tc1);
        Thread t2=new Thread(tc1);
        t1.start();
        t2.start();
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("From Thread2!");
        System.out.println(10/0);
    }
}
