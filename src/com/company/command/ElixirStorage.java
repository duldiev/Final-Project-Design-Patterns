package com.company.command;

public class ElixirStorage implements Command {
    Buildings building1;

    public ElixirStorage (Buildings buildings){
        this.building1 = buildings;
    }
    @Override
    public void build() {
        building1.buildingWithES();
    }
}
