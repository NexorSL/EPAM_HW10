package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Child implements Observed {

    private String status;

    List<Observer> nannies = new ArrayList<>();


    public void childCry(){
        System.out.println("The child is crying!");
        status = "Crying";
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.nannies.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.nannies.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: nannies){
            observer.check(status);
        }
    }
}
