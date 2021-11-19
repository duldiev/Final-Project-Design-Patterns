package com.company.troops;

import com.company.Troop;
import com.company.db.Level;
import com.company.strategy.damage_strategy.DamageWithBomb;
import com.company.strategy.fly_strategy.FlyWithAirBalloon;

import java.io.IOException;

public class Balloon extends Troop {

    public Balloon() {
        super(new FlyWithAirBalloon(), new DamageWithBomb());
    }

    @Override
    public void description() {
        System.out.println("Balloons are \"promoted\" Wall Breakers that now attack from a hot air balloon.");
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
        System.out.println("Balloon attacking!");
    }

    @Override
    public String getName() {
        return "Balloon";
    }

    @Override
    public int currentLevel() {
        return 1;
    }
}
