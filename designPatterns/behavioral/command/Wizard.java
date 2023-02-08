package designPatterns.behavioral.command;

import designPatterns.behavioral.command.spells.Spell;

import java.util.ArrayList;
import java.util.List;

public class Wizard {

    private final String name;
    private int energy;
    private List<Spell> spells;

    public Wizard(String name, int energy) {
        this.name = name;
        this.energy = energy;
        this.spells = new ArrayList<Spell>();
    }

    public String getName() {
        return this.name;
    }

    public int getEnergy() {
        return this.energy;
    }

    public List getSpells() {
        return this.spells;
    }

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }

    public void castSpells() {
        if(energy > this.spells.size()) {
            this.spells.forEach(Spell::cast);
            this.energy = this.energy - this.spells.size();
        }
        else {
            System.out.println("Not enough energy to cast spells!");
        }
    }

    public void dispelSpells() {
        this.spells.forEach(Spell::dispel);
        this.spells = new ArrayList<>();
    }
}
