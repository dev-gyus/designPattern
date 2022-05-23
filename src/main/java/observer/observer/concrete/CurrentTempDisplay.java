package observer.observer.concrete;

import observer.observer.Display;
import observer.observer.Observer;
import observer.subject.Subject;

public class CurrentTempDisplay implements Observer, Display {
    private int temperature;
    private int pressure;
    private int humidity;
    private Subject subject;

    public CurrentTempDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int temperature, int pressure, int humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }


    @Override
    public void display() {
        System.out.printf("temperature = %d / pressure = %d / humidity = %d \n", temperature, pressure, humidity);
    }
}
