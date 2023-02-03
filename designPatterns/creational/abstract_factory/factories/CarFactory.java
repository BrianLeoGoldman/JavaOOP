package designPatterns.creational.abstract_factory.factories;

import designPatterns.creational.abstract_factory.Battery;
import designPatterns.creational.abstract_factory.Chassis;
import designPatterns.creational.abstract_factory.Engine;
import designPatterns.creational.abstract_factory.Radiator;

public interface CarFactory {

    public Chassis buildChassis(String code);

    public Engine buildEngine(int horsepower);

    public Radiator buildRadiator();

    public Battery buildBattery(int voltage) throws Exception;

}
