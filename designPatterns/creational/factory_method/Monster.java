package designPatterns.creational.factory_method;

public class Monster extends Enemy {

    public Monster(int life, int strength, String reward) {
        super(life, strength, reward);
    }

    public int monsterAttack() {
        return this.basicAttack() * 2;
    }

    public String display() {
        return "[Monster => " + super.display();
    }
}
