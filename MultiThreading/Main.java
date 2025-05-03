import Syncronization.Counter;
import Syncronization.*;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        MyThread thread1 = new MyThread(c);
        MyThread thread2 = new MyThread(c);
        thread1.start();
        thread2.start();

        System.out.println(c.i);


    }
}
