package designPatterns.behavioral.command.spells;

import designPatterns.behavioral.command.Unit;

public class IncreaseStamina implements Spell {

    private int amount;
    private boolean isActive;
    private Unit receiver;

    public IncreaseStamina(int amount, Unit receiver) {
        this.amount = amount;
        this.isActive = false;
        this.receiver = receiver;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Unit getReceiver() {
        return receiver;
    }

    public void setReceiver(Unit receiver) {
        this.receiver = receiver;
    }

    @Override
    public void cast() {
        this.receiver.setStamina(this.receiver.getStamina() + this.amount);
        System.out.println("Increased " + this.receiver.getName() + " stamina by " + this.amount + "!");
        this.isActive = true;
    }

    @Override
    public void dispel() {
        if(this.isActive) {
            this.receiver.setStamina(this.receiver.getStamina() - this.amount);
            System.out.println("Increase stamina spell has been removed from " + this.receiver.getName());
        }
        else {
            System.out.println("You can't dispel a spell that is not active!");
        }
    }
}
