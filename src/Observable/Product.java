package Observable;

import Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
private String name;

    public void setAvailability(boolean available) {
availability = this.name + (available ? " Available" : " Not Available ");
notifyAllObservers();
    }

    private String availability;
private List<Observer> observerlist ;
public Product(String name){
    this.name=name;
    this.observerlist=new ArrayList<>();
}

    @Override
    public void addobserver(Observer observer) {
    observerlist.add(observer);

    }

    @Override
    public void deleteobserver(Observer observer) {
observerlist.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
    for(Observer o : observerlist)
        o.update(availability);

    }
}
