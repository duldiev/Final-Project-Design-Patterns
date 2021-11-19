package com.company.command.builderPattern;

public interface ConstructionBuilder {
    public void buildElixirCollector();
    public void buildDarkElixirCollector();
    public void buildGoldCollector();
    public void buildElixirStorage();
    public void buildDarkElixirStorage();
    public void buildGoldStorage();
    public Building getBuilding();
}
