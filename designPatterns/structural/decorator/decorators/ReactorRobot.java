package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.Robot;

public class ReactorRobot extends RobotDecorator {

    public ReactorRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public String build() {
        return this.robot.build() + "===|===";
    }

    @Override
    public String getDescription() {
        return this.robot.getDescription() + " equipped with a reactor";
    }
}
