package com.company.decorator;

import com.company.Troop;

public abstract class TroopDecorator extends Troop {
    protected Troop decoratedTroop;

    public TroopDecorator(Troop decoratedTroop) {
        this.decoratedTroop = decoratedTroop;
    }

    public void description() {
        decoratedTroop.description();
    }

    public void attack() {
        decoratedTroop.attack();
    }

    public String getName() {
        return decoratedTroop.getName();
    }

    public int currentLevel() {
        return decoratedTroop.currentLevel();
    }
}
