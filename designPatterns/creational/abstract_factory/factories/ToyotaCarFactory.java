package designPatterns.creational.abstract_factory.factories;

import designPatterns.creational.abstract_factory.Battery;
import designPatterns.creational.abstract_factory.Chassis;
import designPatterns.creational.abstract_factory.Engine;
import designPatterns.creational.abstract_factory.Radiator;
import designPatterns.creational.abstract_factory.toyota.ToyotaBattery;
import designPatterns.creational.abstract_factory.toyota.ToyotaChassis;
import designPatterns.creational.abstract_factory.toyota.ToyotaEngine;
import designPatterns.creational.abstract_factory.toyota.ToyotaRadiator;

public class ToyotaCarFactory implements CarFactory {

    @Override
    public Chassis buildChassis(String code) {
        return new ToyotaChassis(code);
    }

    @Override
    public Engine buildEngine(int horsepower) {
        return new ToyotaEngine(horsepower);
    }

    @Override
    public Radiator buildRadiator() {
        return new ToyotaRadiator();
    }

    @Override
    public Battery buildBattery(int voltage) throws Exception {
        if(voltage > 12) {
            return new ToyotaBattery();
        }
        else {
            throw new Exception("Not enough voltage to build a Toyota battery");
        }
    }
}
