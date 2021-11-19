package com.company.strategy.damage_strategy;

public class DamageWithLongBow implements DamageStrategy {
    @Override
    public void damage() {
        System.out.println("I shooting with long bow.");
    }
}
