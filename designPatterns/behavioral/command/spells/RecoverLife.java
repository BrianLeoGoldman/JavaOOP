package designPatterns.behavioral.command.spells;

import designPatterns.behavioral.command.Unit;

public class RecoverLife implements Spell {

    private int amount;
    private Unit receiver;

    public RecoverLife(int amount, Unit receiver) {
        this.amount = amount;
        this.receiver = receiver;
    }

    @Override
    public void cast() {
        this.receiver.setLife(this.receiver.getLife() + this.amount);
        System.out.println(this.receiver.getName() + " recovered " + this.amount + " points of life!");
    }

    @Override
    public void dispel() {
        // this.receiver.setLife(this.receiver.getLife() - this.amount);
        System.out.println("A recover life spell cannot be removed");
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
}
