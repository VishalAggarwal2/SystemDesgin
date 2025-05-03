package Syncronization;

public class Counter {

    public int i;
    public Counter(){
        i=0;
    }

    public  synchronized void  increment(){
        this.i++;
    }
}
