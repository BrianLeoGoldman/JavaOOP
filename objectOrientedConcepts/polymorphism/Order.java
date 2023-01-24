package objectOrientedConcepts.polymorphism;

public class Order implements Executable {

    @Override
    public String execute() {
        String text = "This is just a text";
        int number = 72;
        return "We are implementing the Execute method in Order class using text " + text + " and number " + number;
    }
}
