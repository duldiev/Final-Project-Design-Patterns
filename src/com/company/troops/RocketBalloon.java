package com.company.troops;

import com.company.Troop;
import com.company.db.Level;
import com.company.strategy.damage_strategy.DamageWithBomb;
import com.company.strategy.fly_strategy.FlyWithAirBalloon;

import java.io.IOException;

public class RocketBalloon extends Troop {

    public RocketBalloon() {
        super(new FlyWithAirBalloon(), new DamageWithBomb());
    }

    @Override
    public void description() {
        System.out.println("Retrofitted with two carefully safety-inspected booster rockets, the Rocket Balloon gets a flying start to every battle!");
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
        System.out.println("Rocket Balloon attacking!");
    }

    @Override
    public String getName() {
        return "RocketBalloon";
    }

    @Override
    public int currentLevel() {
        return 1;
    }
}
