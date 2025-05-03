package Syncronization;

public class MyThread  extends  Thread{
    Counter count;
    public MyThread(Counter c){
        count =c;
    }
    @Override
    public void run() {

        for (int i=0;i<1000;i++){
            count.increment();
        }
    }
}
