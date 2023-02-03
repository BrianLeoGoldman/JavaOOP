package designPatterns.creational.abstract_factory.ford;

import designPatterns.creational.abstract_factory.Battery;

public class FordBattery implements Battery {

    @Override
    public String turnOn() {
        return "Turning on the Ford battery";
    }

    @Override
    public String turnOff() {
        return "Turning off the Ford battery";
    }
}
