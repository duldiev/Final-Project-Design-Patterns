package com.company.strategy.damage_strategy;

public class DamageWithSword implements DamageStrategy {
    @Override
    public void damage() {
        System.out.println("I am killing with my sword!");
    }
}
