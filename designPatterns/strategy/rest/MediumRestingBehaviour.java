package designPatterns.strategy.rest;

public class MediumRestingBehaviour implements RestingBehaviour {
    @Override
    public void rest() {
        String player1 = "Samuel";
        String player2 = "Johanna";
        System.out.println("Playing a poker match with " + player1 + " and " + player2);
    }
}
