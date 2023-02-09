package designPatterns.behavioral.command.spells;

import designPatterns.behavioral.command.Unit;

public class BerserkAttack implements Spell {

    private Unit receiver;

    public BerserkAttack(Unit receiver) {
        this.receiver = receiver;
    }

    @Override
    public void cast() {
        this.receiver.strongAttack();
    }

    @Override
    public void dispel() {
        System.out.println("A berserk attack spell cannot be removed");
    }
}
