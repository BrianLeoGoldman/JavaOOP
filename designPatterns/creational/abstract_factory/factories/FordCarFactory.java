package designPatterns.creational.abstract_factory.factories;

import designPatterns.creational.abstract_factory.Battery;
import designPatterns.creational.abstract_factory.Chassis;
import designPatterns.creational.abstract_factory.Engine;
import designPatterns.creational.abstract_factory.Radiator;
import designPatterns.creational.abstract_factory.ford.FordBattery;
import designPatterns.creational.abstract_factory.ford.FordChassis;
import designPatterns.creational.abstract_factory.ford.FordEngine;
import designPatterns.creational.abstract_factory.ford.FordRadiator;

public class FordCarFactory implements CarFactory {

    @Override
    public Chassis buildChassis(String code) {
        return new FordChassis(code);
    }

    @Override
    public Engine buildEngine(int horsepower) {
        return new FordEngine(horsepower);
    }

    @Override
    public Radiator buildRadiator() {
        return new FordRadiator();
    }

    @Override
    public Battery buildBattery(int voltage) throws Exception {
        if(voltage > 10) {
            return new FordBattery();
        }
        else {
            throw new Exception("Not enough voltage to build a Ford battery");
        }
    }
}
