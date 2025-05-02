package Products;

import java.util.LinkedList;
import java.util.List;

public class SamsungPhone implements MobilePhone{

    // This Is The Actual List of observer
   List<Observer> observer;


    public SamsungPhone(){
        observer = new LinkedList<>();
    }
    @Override
    public void updateStock() {
        System.out.println("Samsung Phone Stock Updated");
        for(Observer obs:observer){
            obs.update(this);
        }
    }
    @Override
    public void addObserver(Observer u) {
        observer.add(u);
    }

    @Override
    public String getProductName() {
        return "Samsung pHONE";
    }
}
