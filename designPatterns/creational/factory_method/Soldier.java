package designPatterns.creational.factory_method;

public class Soldier extends Enemy {

    public Soldier(int life, int strength, String reward) {
        super(life, strength, reward);
    }

    public int attack() {
        return super.attack() + 10;
    }

    public String display() {
        return "[Soldier => " + super.display();
    }
}
