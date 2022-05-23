package observer.subject.concrete;

import observer.observer.Observer;
import observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;


public class WeatherData implements Subject {
    private List<Observer> observerList;
    private int temperature;
    private int pressure;
    private int humidity;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(temperature, pressure, humidity));
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int temperature, int pressure, int humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
}
