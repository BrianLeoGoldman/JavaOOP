package objectOrientedConcepts.polymorphism;

public class Command implements Executable {

    @Override
    public String execute() {
        return "We are implementing the Execute method in Command class";
    }
}
