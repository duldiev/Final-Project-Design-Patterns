package com.company.state;

public class StartState implements State {

    @Override
    public void attack(HomeVillage homeVillage) {
        System.out.println(homeVillage.getArmySize() + " troops are attacking!");
        homeVillage.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
