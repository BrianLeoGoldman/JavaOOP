package designPatterns.creational.abstract_factory.toyota;

import designPatterns.creational.abstract_factory.Battery;

public class ToyotaBattery implements Battery {

    @Override
    public String turnOn() {
        return "Turning on the Toyota battery";
    }

    @Override
    public String turnOff() {
        return "Turning off the Toyota battery";
    }
}
