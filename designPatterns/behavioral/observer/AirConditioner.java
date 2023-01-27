package designPatterns.behavioral.observer;

public class AirConditioner implements Observer {

    private WeatherStation station;

    public AirConditioner(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        if(station.getTemperature() > 28) {
            System.out.println("Refreshing the air because temperature is " + station.getTemperature());
        }
    }
}
