package designPatterns.strategy.rest;

public class HighRestingBehaviour implements RestingBehaviour {
    @Override
    public void rest() {
        String destination = "San Francisco, California";
        int days = 10;
        long money = 10000;
        while (days > 0) {
            System.out.println("Resting in " + destination + " with " + money + " dollars");
            days--;
            money = money - 750;
        }
    }
}
