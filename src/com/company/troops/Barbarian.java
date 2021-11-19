package com.company.troops;

import com.company.Troop;
import com.company.db.Level;
import com.company.strategy.damage_strategy.DamageWithSword;
import com.company.strategy.fly_strategy.NoFly;

import java.io.IOException;

public class Barbarian extends Troop {

    public Barbarian() {
        super(new NoFly(), new DamageWithSword());
    }

    @Override
    public void description() {
        System.out.println("Barbarian appears as a male kilt-clad warrior with an angry, battle-ready expression, hungry for destruction.");
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
        System.out.println("Barbarian");
    }

    @Override
    public String getName() {
        return "Barbarian";
    }

    @Override
    public int currentLevel() {
        return 1;
    }
}
