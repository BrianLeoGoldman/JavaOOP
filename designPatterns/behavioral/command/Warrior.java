package designPatterns.behavioral.command;

public class Warrior extends Unit {

    public Warrior(String name, int life, int energy, int stamina) {
        super(name, life, energy, stamina);
    }

    public void weakAttack() {
        if(this.getStamina() > 3) {
            this.setStamina(this.getStamina() - 3);
            System.out.println("Attacking slowly with an energy of " + this.getEnergy() / 2);
        }
        else {
            System.out.println("Not enough stamina to attack");
        }
    }

    public void strongAttack() {
        if(this.getStamina() > 7) {
            this.setStamina(this.getStamina() - 7);
            System.out.println("Attacking fast with an energy of " + this.getEnergy());
        }
        else {
            System.out.println("Not enough stamina to attack");
        }
    }
}
