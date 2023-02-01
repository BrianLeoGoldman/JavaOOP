package designPatterns.creational.factory_method;

public class Ghost extends Enemy {

    public Ghost(int life, int strength, String reward) {
        super(life, strength, reward);
    }

    public int attack() {
        return super.attack() - 3;
    }

    public void receiveAttack(int impact) {
        this.life = this.life - impact + 5;
    }

    public String display() {
        return "[Ghost => " + super.display();
    }
}
