package com.company.strategy.damage_strategy;

public class DamageWithBomb implements DamageStrategy {
    @Override
    public void damage() {
        System.out.println("I am bombing!!!");
    }
}
