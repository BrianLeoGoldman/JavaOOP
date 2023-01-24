package designPatterns.strategy.display;

import designPatterns.strategy.display.DisplayingBehaviour;

public class NoDisplayingBehaviour implements DisplayingBehaviour {
    @Override
    public void display(String name, int id) {
        System.out.println("I have nothing to show you...");
    }
}
