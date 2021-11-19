package com.company.troops;

import com.company.Troop;
import com.company.db.Level;
import com.company.strategy.damage_strategy.DamageWithLongBow;
import com.company.strategy.fly_strategy.NoFly;

import java.io.IOException;

public class Archer extends Troop {

    public Archer() {
        super(new NoFly(), new DamageWithLongBow());
    }

    @Override
    public void description() {
        System.out.println("These sharpshooters like to keep their distance on the battlefield and in life. Nothing makes them happier than single-mindedly taking down their target.");
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
        System.out.println("Archer attacking!");
    }

    @Override
    public String getName() {
        return "Archer";
    }

    @Override
    public int currentLevel() {
        return 1;
    }
}
