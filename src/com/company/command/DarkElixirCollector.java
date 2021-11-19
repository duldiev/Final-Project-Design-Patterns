package com.company.command;

public class DarkElixirCollector implements Command{
    Buildings building1;

    public DarkElixirCollector (Buildings buildings){
        this.building1 = buildings;
    }
    @Override
    public void build() {
        building1.buildingWithDEC();
    }
}
