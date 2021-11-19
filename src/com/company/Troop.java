package com.company;

import com.company.strategy.damage_strategy.DamageStrategy;
import com.company.strategy.fly_strategy.FlyStrategy;

import java.io.IOException;

public abstract class Troop {
    FlyStrategy flyStrategy;
    DamageStrategy damageStrategy;

    public abstract int damagePerAttack() throws IOException;
    public abstract int hitPoints() throws IOException;
    public abstract int trainingCost() throws IOException;

    public abstract void attack();
    public abstract void description();

    public abstract String getName();
    public abstract int currentLevel();


    public Troop() {

    }

    public Troop(FlyStrategy flyStrategy, DamageStrategy damageStrategy) {
        this.flyStrategy = flyStrategy;
        this.damageStrategy = damageStrategy;
    }

    public void showProperties() throws IOException {
        System.out.println(this.getName() + " (Level " + this.currentLevel() + "): DPA - " + this.damagePerAttack() +
                " HP - " + this.hitPoints() + " TC - " + this.trainingCost());
    }

    public void performFLy() {
        this.flyStrategy.fly();
    }

    public void performDamage() {
        this.damageStrategy.damage();
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setDamageStrategy(DamageStrategy damageStrategy) {
        this.damageStrategy = damageStrategy;
    }
}
