package observer;

import observer.observer.Observer;
import observer.observer.concrete.CurrentTempDisplay;
import observer.observer.concrete.LineTempDisplay;
import observer.subject.Subject;
import observer.subject.concrete.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentTempDisplay = new CurrentTempDisplay(weatherData);
        Observer lineTempDisplay = new LineTempDisplay(weatherData);

        weatherData.setMeasurements(80, 123, 56);
        weatherData.setMeasurements(88, 123, 45);
        weatherData.setMeasurements(75, 123, 65);
    }
}
