package designPatterns.behavioral.command;

public abstract class Unit {

    private String name;
    private int life;
    private int energy;
    private int stamina;

    public Unit(String name, int life, int energy, int stamina) {
        this.name = name;
        this.life = life;
        this.energy = energy;
        this.stamina = stamina;
    }

    public void display(){
        System.out.println("Name: " + this.name +
                " | Life: " + this.life +
                " | Energy: " + this.energy +
                " | Stamina: " + this.stamina);
    }

    public void weakAttack() {
        System.out.println("This is the weak attack of a unit");
    }

    public void strongAttack() {
        System.out.println("This is the strong attack of a unit");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
