package designPatterns.behavioral.strategy.work;

public class NoWorkingBehaviour implements WorkingBehaviour {
    @Override
    public void work() {
        System.out.println("Doing nothing...");
    }
}
