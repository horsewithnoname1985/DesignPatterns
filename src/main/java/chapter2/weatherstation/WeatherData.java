package chapter2.weatherstation;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

//    public void registerObserver(Observer o) {
//        observers.add(o);
//    }

//    public void removeObserver(Observer o) {
//        int i = observers.indexOf(o);
//        if (i >= 0) {
//            observers.remove(i);
//        }
//    }

//    public void notifyObservers() {
//        for (Observer observer : observers){
//            observer.update(temperature, humidity, pressure);
//        }
//    }

    private void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
