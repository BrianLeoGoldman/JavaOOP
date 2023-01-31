package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.Robot;

public class LaserRobot extends RobotDecorator {

    public LaserRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public String build() {
        return this.robot.build() + "*---*";
    }

    @Override
    public String getDescription() {
        return this.robot.getDescription() + " equipped with lasers";
    }
}
