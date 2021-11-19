package com.company.decorator;

import com.company.Troop;
import com.company.db.Level;

import java.io.IOException;

public class ThirdLevelDecorator extends TroopDecorator {

    public ThirdLevelDecorator(Troop decoratedTroop) {
        super(decoratedTroop);
    }

    @Override
    public void description() {
        decoratedTroop.description();
    }

    @Override
    public int damagePerAttack() throws IOException {
        return Level.getLevel(3, decoratedTroop.getName(), "Damage per Attack");
    }

    @Override
    public int hitPoints() throws IOException {
        return Level.getLevel(3, decoratedTroop.getName(), "Hit points");
    }

    @Override
    public int trainingCost() throws IOException {
        return Level.getLevel(3, decoratedTroop.getName(), "Training cost");
    }

    @Override
    public void attack() {
        decoratedTroop.attack();
    }

    @Override
    public String getName() {
        return decoratedTroop.getName();
    }

    @Override
    public int currentLevel() {
        return 3;
    }
}
