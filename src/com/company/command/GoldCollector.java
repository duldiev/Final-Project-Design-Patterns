package com.company.command;

public class GoldCollector implements Command{
    Buildings building1;

    public GoldCollector (Buildings buildings){
        this.building1 = buildings;
    }
    @Override
    public void build() {
        building1.buildingWithGC();
    }
}
