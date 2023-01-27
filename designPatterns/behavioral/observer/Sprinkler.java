package designPatterns.behavioral.observer;

public class Sprinkler implements Observer {

    private WeatherStation station;

    public Sprinkler(WeatherStation station) {
        // This constructor couples the Sprinkler to the WeatherStation, but this is necessary to access the station
        // data when there is an update
        this.station = station;
    }
    @Override
    public void update() {
        if(station.getHumidity() < 35) {
            System.out.println("Watering the grass because humidity is " + station.getHumidity());
        }
    }
}
