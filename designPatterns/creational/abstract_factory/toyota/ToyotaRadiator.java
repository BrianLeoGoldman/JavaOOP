package designPatterns.creational.abstract_factory.toyota;

import designPatterns.creational.abstract_factory.Radiator;

public class ToyotaRadiator implements Radiator {

    @Override
    public String coolEngine() {
        return "Cooling engine with the Toyota radiator";
    }

    @Override
    public String heatCabin() {
        return "Heating the cabin with the Toyota radiator";
    }
}
