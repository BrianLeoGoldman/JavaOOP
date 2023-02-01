package designPatterns.creational.factory_method;

public class Monster extends Enemy {

    public Monster(int life, int strength, String reward) {
        super(life, strength, reward);
    }

    public int attack() {
        return super.attack() * 2;
    }

    public String display() {
        return "[Monster => " + super.display();
    }
}
