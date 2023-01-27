package designPatterns.behavioral.observer;

public interface Observable {

    public void register(Observer observer);

    public void remove(Observer observer);

    public void notifyChanges();
}
