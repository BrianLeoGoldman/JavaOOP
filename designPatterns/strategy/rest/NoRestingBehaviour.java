package designPatterns.strategy.rest;

public class NoRestingBehaviour implements RestingBehaviour {
    @Override
    public void rest() {
        System.out.println("No resting for me...");
    }
}
