package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.Robot;

public class BeamRobot extends RobotDecorator {

    public BeamRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public String build() {
        return this.robot.build() + "-(0)-";
    }

    @Override
    public String getDescription() {
        return this.robot.getDescription() + " equipped with beams";
    }
}
