package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.Robot;

public class NanoRobot extends RobotDecorator {

    public NanoRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public String build() {
        return this.robot.build() + "-0-0-0-0-";
    }

    @Override
    public String getDescription() {
        return this.robot.getDescription() + " equipped with nanotechnology";
    }}
