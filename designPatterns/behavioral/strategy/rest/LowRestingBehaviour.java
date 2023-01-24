package designPatterns.behavioral.strategy.rest;

public class LowRestingBehaviour implements RestingBehaviour {
    @Override
    public void rest() {
        int timeToRest = 1;
        System.out.println("Resting for " + timeToRest + " hours...");
    }
}
