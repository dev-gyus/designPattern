package observer.observer.concrete;

import observer.observer.Display;
import observer.observer.Observer;
import observer.subject.Subject;
import observer.subject.concrete.WeatherData;


public class LineTempDisplay implements Observer, Display {
    private int temperature;
    private int pressure;
    private int humidity;
    private Subject subject;

    public LineTempDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature = " + temperature);
        System.out.println("pressure = " + pressure);
        System.out.println("humidity = " + humidity);
    }

    @Override
    public void update(int temperature, int pressure, int humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
