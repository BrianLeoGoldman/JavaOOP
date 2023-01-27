package designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    List<Observer> observers;
    private int humidity;
    private int temperature;

    public WeatherStation(){
        this.humidity = 0;
        this.temperature = 0;
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyChanges() {
        this.observers.forEach(Observer::update);
    }

    public int getHumidity() {
        return this.humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        this.notifyChanges();
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyChanges();
    }
}
