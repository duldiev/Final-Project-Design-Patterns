package com.company.state;

public class StopState implements State {

    @Override
    public void attack(HomeVillage homeVillage) {
        System.out.println("Troops are coming to home!");
        int earned = (int)(Math.random() * 1000) * homeVillage.getArmySize();
        homeVillage.setGoldStorageCurrent(Math.min(homeVillage.getGoldStorageLimit(), homeVillage.getGoldStorageCurrent() + earned));
        homeVillage.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
