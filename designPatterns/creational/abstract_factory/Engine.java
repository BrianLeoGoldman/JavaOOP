package designPatterns.creational.abstract_factory;

public abstract class Engine {

    int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public String start() {
        return "Starting engine of " + this.horsepower + " HP";
    }

    public String stop() {
        return "Stopping engine of " + this.horsepower + " HP";
    }
}
