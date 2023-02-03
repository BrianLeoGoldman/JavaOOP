package designPatterns.creational.abstract_factory;

public class Truck {

    private Chassis chassis;
    private Engine engine;
    private Radiator radiator;
    private Battery battery;

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Radiator getRadiator() {
        return radiator;
    }

    public void setRadiator(Radiator radiator) {
        this.radiator = radiator;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
