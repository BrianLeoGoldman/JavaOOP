package designPatterns.creational.factory_method;

public abstract class Enemy {

    protected int life;
    protected int strength;
    protected String reward;

    public Enemy(int life, int strength, String reward) {
        this.life = life;
        this.strength = strength;
        this.reward = reward;
    }

    public int attack() {
        return this.strength;
    }

    public void receiveAttack(int impact) {
        this.life = this.life - impact;
    }

    public String display() {
        return "Life: " + this.life + " | Strength: " + this.strength + " | Reward: " + this.reward + "]";
    }
}
