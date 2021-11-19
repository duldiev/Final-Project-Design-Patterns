package com.company.troops;

import com.company.Troop;
import com.company.db.Level;
import com.company.strategy.damage_strategy.DamageWithDarkElixir;
import com.company.strategy.fly_strategy.FlyWithWings;

import java.io.IOException;

public class Minion extends Troop {

    public Minion() {
        super(new FlyWithWings(), new DamageWithDarkElixir());
    }

    @Override
    public void description() {
        System.out.println("This terror of the skies was born out of Dark Elixir. Undetectable by the Seeking Air Mine, Minions materialize with ease, but are fragile in our world.");
    }

    @Override
    public int damagePerAttack() throws IOException {
        return Level.getLevel(1, this.getName(), "Damage per Attack");
    }

    @Override
    public int hitPoints() throws IOException {
        return Level.getLevel(1, this.getName(), "Damage per Attack");
    }

    @Override
    public int trainingCost() throws IOException {
        return Level.getLevel(1, this.getName(), "Damage per Attack");
    }

    @Override
    public void attack() {
        System.out.println("Minion attacking!");
    }

    @Override
    public String getName() {
        return "Minion";
    }

    @Override
    public int currentLevel() {
        return 1;
    }
}
