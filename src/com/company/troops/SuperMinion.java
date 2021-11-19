package com.company.troops;

import com.company.Troop;
import com.company.db.Level;
import com.company.strategy.damage_strategy.DamageWithDarkElixir;
import com.company.strategy.fly_strategy.FlyWithWings;

import java.io.IOException;

public class SuperMinion extends Troop {

    public SuperMinion() {
        super(new FlyWithWings(), new DamageWithDarkElixir());
    }

    @Override
    public void description() {
        System.out.println("Super Minion's big forehead isn't just for show: sniping enemy defenses from a safe distance is simply a brainy move! Especially when you've grown too big to avoid Seeking Air Mines.");
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
        System.out.println("Super Minion attacking!");
    }

    @Override
    public String getName() {
        return "SuperMinion";
    }

    @Override
    public int currentLevel() {
        return 1;
    }
}
