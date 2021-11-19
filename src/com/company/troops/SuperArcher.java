package com.company.troops;

import com.company.Troop;
import com.company.db.Level;
import com.company.strategy.damage_strategy.DamageWithLongBow;
import com.company.strategy.fly_strategy.NoFly;

import java.io.IOException;

public class SuperArcher extends Troop {

    public SuperArcher() {
        super(new NoFly(), new DamageWithLongBow());
    }

    @Override
    public void description() {
        System.out.println("Having achieved serious arm strength, the Super Archer can now threaten targets several buildings away.");
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
        System.out.println("Super Archer attacking!");
    }

    @Override
    public String getName() {
        return "SuperArcher";
    }

    @Override
    public int currentLevel() {
        return 1;
    }
}
