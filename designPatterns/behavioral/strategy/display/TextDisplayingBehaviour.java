package designPatterns.behavioral.strategy.display;

public class TextDisplayingBehaviour implements DisplayingBehaviour {
    @Override
    public void display(String name, int code) {
        System.out.println("Employee name is " + name + " and employee code is " + code);
    }
}
