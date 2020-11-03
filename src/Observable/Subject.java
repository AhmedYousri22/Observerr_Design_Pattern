package Observable;

import Observers.Observer;

public interface Subject {
    void addobserver(Observer observer);
    void deleteobserver(Observer observer);
    void notifyAllObservers();

}
