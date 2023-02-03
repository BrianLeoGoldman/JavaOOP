package designPatterns.creational.abstract_factory.ford;

import designPatterns.creational.abstract_factory.Radiator;

public class FordRadiator implements Radiator {

    @Override
    public String coolEngine() {
        return "Cooling engine with the Ford radiator";
    }

    @Override
    public String heatCabin() {
        return "Heating the cabin with the Ford radiator";
    }
}
