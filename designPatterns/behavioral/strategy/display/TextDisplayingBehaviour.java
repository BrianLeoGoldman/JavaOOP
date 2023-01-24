package designPatterns.behavioral.strategy.display;

public class TextDisplayingBehaviour implements DisplayingBehaviour {
    @Override
    public void display(String name, int id) {
        System.out.println("Employee name is " + name + " and employee id is " + id);
    }
}
