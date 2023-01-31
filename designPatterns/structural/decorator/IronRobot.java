package designPatterns.structural.decorator;

public class IronRobot extends Robot {
    @Override
    public String build() {
        return "[|---|]";
    }

    @Override
    public String getDescription() {
        return "Robot made of iron that builds stuff";
    }
}
