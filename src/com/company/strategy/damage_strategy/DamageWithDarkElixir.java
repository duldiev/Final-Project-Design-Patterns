package com.company.strategy.damage_strategy;

public class DamageWithDarkElixir implements DamageStrategy {
    @Override
    public void damage() {
        System.out.println("I splashing dark elixirs!!!");
    }
}
