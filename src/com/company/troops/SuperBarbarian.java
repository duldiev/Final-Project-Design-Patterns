package com.company.troops;

import com.company.Troop;
import com.company.db.Level;
import com.company.strategy.damage_strategy.DamageWithSword;
import com.company.strategy.fly_strategy.NoFly;

import java.io.IOException;

public class SuperBarbarian extends Troop {

    public SuperBarbarian() {
        super(new NoFly(), new DamageWithSword());
    }

    @Override
    public void description() {
        System.out.println("Superior in health, power, speed and most importantly, hair, the Super Barbarians are what regular Barbarians dream of becoming!");
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
        System.out.println("Super Barbarian attacking!");
    }

    @Override
    public String getName() {
        return "SuperBarbarian";
    }

    @Override
    public int currentLevel() {
        return 1;
    }
}
