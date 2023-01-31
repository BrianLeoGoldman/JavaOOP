package designPatterns.structural.decorator;

public class SteelRobot extends Robot {
    @Override
    public String build() {
        return "[-|||-]";
    }

    @Override
    public String getDescription() {
        return "Robot made of steel that builds stuff";
    }
}
