package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.Robot;

public abstract class RobotDecorator extends Robot {

    protected Robot robot;

    @Override
    public abstract String build();

    @Override
    public abstract String getDescription();
}
