package designPatterns.behavioral.strategy;

import designPatterns.behavioral.strategy.display.DisplayingBehaviour;
import designPatterns.behavioral.strategy.display.NoDisplayingBehaviour;
import designPatterns.behavioral.strategy.rest.NoRestingBehaviour;
import designPatterns.behavioral.strategy.rest.RestingBehaviour;
import designPatterns.behavioral.strategy.work.NoWorkingBehaviour;
import designPatterns.behavioral.strategy.work.WorkingBehaviour;

public class Employee {

    // PROPERTIES
    private final String name;
    private final int id;
    private WorkingBehaviour workingBehaviour;
    private RestingBehaviour restingBehaviour;
    private DisplayingBehaviour displayingBehaviour;

    // CONSTRUCTORS (second one used for constructor dependency injection)
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.workingBehaviour = new NoWorkingBehaviour();
        this.restingBehaviour = new NoRestingBehaviour();
        this.displayingBehaviour = new NoDisplayingBehaviour();
    }

    public Employee(String name, int id,
                    WorkingBehaviour workingBehaviour,
                    RestingBehaviour restingBehaviour,
                    DisplayingBehaviour displayingBehaviour) {
        this.name = name;
        this.id = id;
        this.workingBehaviour = workingBehaviour;
        this.restingBehaviour = restingBehaviour;
        this.displayingBehaviour = displayingBehaviour;
    }

    // SETTERS (used for setter dependency injection)

    public void setWorkingBehaviour(WorkingBehaviour workingBehaviour) {
        this.workingBehaviour = workingBehaviour;
    }

    public void setRestingBehaviour(RestingBehaviour restingBehaviour) {
        this.restingBehaviour = restingBehaviour;
    }

    public void setDisplayingBehaviour(DisplayingBehaviour displayingBehaviour) {
        this.displayingBehaviour = displayingBehaviour;
    }

    // METHODS

    public void work() {
        workingBehaviour.work();
    }

    public void rest() {
        restingBehaviour.rest();
    }

    public void display() {
        displayingBehaviour.display(name, id);
    }


}
