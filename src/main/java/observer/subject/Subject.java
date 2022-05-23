package observer.subject;


import observer.observer.Observer;

public interface Subject {
    void removeObserver(Observer observer);
    void registerObserver(Observer observer);
    void notifyObservers();
}
