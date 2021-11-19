package com.company.command;

public class ElixirCollector implements Command {
    Buildings building1;

    public ElixirCollector (Buildings buildings){
        this.building1 = buildings;
    }
    @Override
    public void build() {
        building1.buildingWithEC();
    }
}
