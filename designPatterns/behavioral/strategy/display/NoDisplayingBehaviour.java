package designPatterns.behavioral.strategy.display;

public class NoDisplayingBehaviour implements DisplayingBehaviour {
    @Override
    public void display(String name, int code) {
        System.out.println("I have nothing to show you...");
    }
}
