package com.company.command;

public class GoldStorage implements Command{
    Buildings building1;

    public GoldStorage (Buildings buildings){
        this.building1 = buildings;
    }
    @Override
    public void build() {
        building1.buildingWithGS();
    }
}
