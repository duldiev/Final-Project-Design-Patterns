package com.company.command;

public class DarkElixirStorage implements Command{
    Buildings building1;

    public DarkElixirStorage (Buildings buildings){
        this.building1 = buildings;
    }
    @Override
    public void build() {
        building1.buildingWithDES();
    }
}
